package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project.bean.StudentTrainingCourse;
import project.database.Database;

public class StudentTrainingCourseDAO {
	private project.database.Database db;
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;
	private List<StudentTrainingCourse> studentTrainingCourseTable;
	private int row;

	public List<StudentTrainingCourse> selectAll() {
		studentTrainingCourseTable = new ArrayList<StudentTrainingCourse>();
		try {
			db = new project.database.Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("select student_id, course_id, priority from Student_Training_Course ");
			rs = ps.executeQuery();

			while (rs.next()) {
				StudentTrainingCourse studentTrainingCourse = new StudentTrainingCourse();

				StudentDAO studentlDAO = new StudentDAO();
				studentTrainingCourse.setStudent(studentlDAO.selectById(rs.getInt("student_id")));

				TrainingCourseDAO trainingCourseDAO = new TrainingCourseDAO();
				studentTrainingCourse.setTrainingCourseID(trainingCourseDAO.selectById(rs.getInt("course_id")));

				studentTrainingCourse.setPriority(rs.getInt("priority"));

				studentTrainingCourseTable.add(studentTrainingCourse);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}
		return studentTrainingCourseTable;
	}

	public StudentTrainingCourse selectById(int id) {
		StudentTrainingCourse studentTrainingCourse = null;
		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"select student_id, course_id, priority from Student_Training_Course where student_id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				studentTrainingCourse = new StudentTrainingCourse();

				StudentDAO studentlDAO = new StudentDAO();
				studentTrainingCourse.setStudent(studentlDAO.selectById(rs.getInt("student_id")));

				TrainingCourseDAO trainingCourseDAO = new TrainingCourseDAO();
				studentTrainingCourse.setTrainingCourseID(trainingCourseDAO.selectById(rs.getInt("course_id")));

				studentTrainingCourse.setPriority(rs.getInt("priority"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}
		return studentTrainingCourse;
	}

	public int insert(StudentTrainingCourse studentTrainingCourse) {
		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"insert into Student_Training_Course(student_id , course_id , priority ) values( ?, ?, ?)");
			int counter = 1;
			ps.setInt(counter++, studentTrainingCourse.getStudent().getStudentID());
			ps.setInt(counter++, studentTrainingCourse.getTrainingCourseID().getCourseID());
			ps.setInt(counter++, studentTrainingCourse.getPriority());
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}
		return row;
	}

	public int update(StudentTrainingCourse studentTrainingCourse) {
		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection
					.prepareStatement("update Student_Training_Course set priority=?, course_id=? where student_id= ?");
			int counter = 1;
			ps.setInt(counter++, studentTrainingCourse.getPriority());
			ps.setInt(counter++, studentTrainingCourse.getTrainingCourseID().getCourseID());
			ps.setInt(counter++, studentTrainingCourse.getStudent().getStudentID());
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}
		return row;
	}

	public int delete(int id) {
		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("delete from Student_Training_Course where student_id =? ");
			ps.setInt(1, id);
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}
		return row;
	}

}

package com.vti.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@Table(name="account")
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private byte accountID;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(nullable=false, length=50)
	private String email;

	@Column(nullable=false, length=50)
	private String firstName;

	@Column(nullable=false, length=50)
	private String lastName;

	@Column(nullable=false, length=50)
	private String username;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="DepartmentID", nullable=false)
	private Department department;

	//bi-directional many-to-one association to Position
	@ManyToOne
	@JoinColumn(name="PositionID", nullable=false)
	private Position position;

	//bi-directional many-to-one association to Salary
	@ManyToOne
	@JoinColumn(name="SalaryID", nullable=false)
	private Salary salary;

	//bi-directional one-to-one association to Employee
	@OneToOne(mappedBy="account")
	private Employee employee;

	//bi-directional many-to-one association to Exam
	@OneToMany(mappedBy="account")
	private List<Exam> exams;

	//bi-directional many-to-one association to Groupaccount
	@OneToMany(mappedBy="account")
	private List<Groupaccount> groupaccounts;

	//bi-directional one-to-one association to Manager
	@OneToOne(mappedBy="account")
	private Manager manager;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="account")
	private List<Question> questions;

	public Account() {
	}

	public byte getAccountID() {
		return this.accountID;
	}

	public void setAccountID(byte accountID) {
		this.accountID = accountID;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Salary getSalary() {
		return this.salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	} 

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Exam> getExams() {
		return this.exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public Exam addExam(Exam exam) {
		getExams().add(exam);
		exam.setAccount(this);

		return exam;
	}

	public Exam removeExam(Exam exam) {
		getExams().remove(exam);
		exam.setAccount(null);

		return exam;
	}

	public List<Groupaccount> getGroupaccounts() {
		return this.groupaccounts;
	}

	public void setGroupaccounts(List<Groupaccount> groupaccounts) {
		this.groupaccounts = groupaccounts;
	}

	public Groupaccount addGroupaccount(Groupaccount groupaccount) {
		getGroupaccounts().add(groupaccount);
		groupaccount.setAccount(this);

		return groupaccount;
	}

	public Groupaccount removeGroupaccount(Groupaccount groupaccount) {
		getGroupaccounts().remove(groupaccount);
		groupaccount.setAccount(null);

		return groupaccount;
	}

	public Manager getManager() {
		return this.manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Question addQuestion(Question question) {
		getQuestions().add(question);
		question.setAccount(this);

		return question;
	}

	public Question removeQuestion(Question question) {
		getQuestions().remove(question);
		question.setAccount(null);

		return question;
	}

}
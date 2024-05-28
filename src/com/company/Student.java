package com.company;

public class Student {
  private  String FirstName;
  private  String LastName;
  private  int TOEFL;
    private int SAT;
 private   double transcript;
 private    String major;
 private   String university;

    public Student(String firstName, String lastName, int TOEFL, int SAT, double transcript, String major, String university) {
        FirstName = firstName;
        LastName = lastName;
        this.TOEFL = TOEFL;
        this.SAT = SAT;
        this.transcript = transcript;
        this.major = major;
        this.university = university;
    }

    public Student() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getTOEFL() {
        return TOEFL;
    }

    public void setTOEFL(int TOEFL) {
        this.TOEFL = TOEFL;
    }

    public int getSAT() {
        return SAT;
    }

    public void setSAT(int SAT) {
        this.SAT = SAT;
    }

    public double getTranscript() {
        return transcript;
    }

    public void setTranscript(double transcript) {
        this.transcript = transcript;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}

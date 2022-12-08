package com.example.grpcserver.demo.model;

public class SubjectMarksModel {
   public String subjectName ;
    public double score ;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public SubjectMarksModel(String subjectName, double score) {
        this.subjectName = subjectName;
        this.score = score;
    }
}

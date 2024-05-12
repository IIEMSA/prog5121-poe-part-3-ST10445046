package main;

public class Task {

    String taskName;
    String taskDescription;
    String developerName;
    String taskStatus;
    int taskNumber;
    int lastAssignedTaskNumber = 0;
    int taskIDNum = 0;
    int taskHours;
     int totalDuration = 0;
    boolean correctDescription;
    
    
    
   //Sets
    public void settaskName(String name) {
        taskName = name;
    }
    
    public void settaskNumber(int number){
        taskNumber = number;
    }
    
    public void settaskDescription(String description){
        taskDescription = description;
    }
    
    public void settaskHours(int duration){
    taskHours = duration;
    totalDuration += duration;
}
    
    public void setdevName(String devDetails){
        developerName = devDetails;
    }
    
    public void setTaskStatus(String status) {
        taskStatus = status;
    }
    
    //Gets
    public String gettaskName() {
        return taskName;
    }
    
    public int gettaskNumber() {
        return taskNumber;
    }
    
    public String gettaskDescription() {
        return taskDescription;
    }
    
    public int gettaskHours() {
        return taskHours;
    }
    
    public String getdevName(){
        return developerName;
    }
    
      public String getTaskStatus() {
        return taskStatus;
    }
    
    public static void showReport() {
        System.out.println("Coming soon!");
    }
    
    public int getTotalDuration() {
        return totalDuration;
    }
    
    

    public Boolean checkTaskDescription() {
        correctDescription = taskDescription.length() <= 50;

        return correctDescription;
    }

    public String createTaskID(String taskName, int taskNumber, String developerName) {
        taskIDNum++;
        taskNumber = taskIDNum;
        String[] names = developerName.split(" ");
        String firstName = names[0]; // First name
        String lastThreeLetters = firstName.length() >= 3 ? firstName.substring(firstName.length() - 3).toUpperCase() : firstName.toUpperCase();
        String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + lastThreeLetters;
        return taskID;
    }

    public String printTaskDetails() {
        String taskID = createTaskID(taskName, taskNumber, developerName);
        lastAssignedTaskNumber++;
        taskNumber = lastAssignedTaskNumber;
        String message = "<html>Developer Name: " + developerName + "<br>"
                + "Task number: " + taskNumber + "<br>"
                + "Task name: " + taskName + "<br>"
                + "Description: " + taskDescription + "<br>"
                + "Task Id: " + taskID + "<br>"
                + "Duration: " + taskHours + " hours<br>"
                + "Task Status: " + taskStatus + "</html>";
        return message;
    }
    
    public int returnTotalHours() {
        return totalDuration;
    }
}

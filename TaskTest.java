package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest {
    
    public TaskTest() {
    }

    @Test
    public void testSettaskName() {
    }

    @Test
    public void testSettaskNumber() {
    }

    @Test
    public void testSettaskDescription() {
    }

    @Test
    public void testSettaskHours() {
    }

    @Test
    public void testSetdevName() {
    }

    @Test
    public void testSetTaskStatus() {
    }

    @Test
    public void testGettaskName() {
    }

    @Test
    public void testGettaskNumber() {
    }

    @Test
    public void testGettaskDescription() {
    }

    @Test
    public void testGettaskHours() {
    }

    @Test
    public void testGetdevName() {
    }

    @Test
    public void testGetTaskStatus() {
    }

    @Test
    public void testShowReport() {
    }

    @Test
    public void testGetTotalDuration() {
    }

   @Test
    public void testCheckTaskDescriptionTrue() {
        Task task = new Task();
        task.settaskDescription("Short description.");
        boolean result = task.checkTaskDescription();
        System.out.println("Test CheckTaskDescriptionTrue: " + result);
        assertTrue(result);
    }

    @Test
    public void testCheckTaskDescriptionFalse() {
        Task task = new Task();
        task.settaskDescription("This is a long description that exceeds the character limit for task descriptions.");
        boolean result = task.checkTaskDescription();
        System.out.println("Test CheckTaskDescriptionFalse: " + result);
        assertFalse(result);
    }

    @Test
    public void testCreateTaskIDTrue() {
        Task task = new Task();
        String taskID = task.createTaskID("Test Task", 1, "John Doe");
        boolean result = taskID.equals("TE:1:OHN");
        System.out.println("Test CreateTaskIDTrue: " + result);
        assertTrue(result);
    }

    @Test
    public void testCreateTaskIDFalse() {
        Task task = new Task();
        String taskID = task.createTaskID("Test Task", 1, "John Doe");
        boolean result = taskID.equals("TE:1:DOE");
        System.out.println("Test CreateTaskIDFalse: " + result);
        assertFalse(result);
    }

    @Test
    public void testReturnTotalHoursTrue() {
        Task task = new Task();
        task.settaskHours(3);
        boolean result = task.returnTotalHours() == 3;
        System.out.println("Test ReturnTotalHoursTrue: " + result);
        assertTrue(result);
    }

    @Test
    public void testReturnTotalHoursFalse() {
        Task task = new Task();
        task.settaskHours(3);
        boolean result = task.returnTotalHours() == 5;
        System.out.println("Test ReturnTotalHoursFalse: " + result);
        assertFalse(result);
    }
}
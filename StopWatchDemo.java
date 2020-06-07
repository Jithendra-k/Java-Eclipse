import java.util.*; 
class StopWatch 
{ 
 private Calendar startTime,endTime; 
 public StopWatch() 
 { 
  startTime=Calendar.getInstance(); 
 } 
 public void start() 
 { 
  startTime=Calendar.getInstance(); 
 } 
 public void stop() 
 { 
  endTime=Calendar.getInstance(); 
 } 
 public long getElapsedTime() 
 { 
  return endTime.getTimeInMillis()-startTime.getTimeInMillis(); 
 } 
 public Calendar getStartTime() 
 { 
  return startTime; 
 } 
 public Calendar getEndTime() 
 { 
  return endTime; 
 } 
} 
 
 
public class StopWatchDemo 
{ 
 public static void main(String args[]) 
 { 
  StopWatch sw=new StopWatch(); 
  sw.stop(); 
  System.out.println(sw.getElapsedTime()); 
 } 
} 
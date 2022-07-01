package String.Java;

public class _0551_StudentAttendanceRecordI {

  /**
   * Iteration
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(N)
   */
  public boolean checkRecord(String s) {
    int abs = 0;
    int lat = 0;
    
    for (char str : s.toCharArray()) {
      if (str == 'L') {
        lat++;  
      }
      else if (str == 'A') {
        lat = 0;
        abs++;
      }
      else {
        lat = 0;
      }
      if (abs >= 2 || lat == 3) return false;
    }
    return true;
  }
}

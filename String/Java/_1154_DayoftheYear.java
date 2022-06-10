package String.Java;

public class _1154_DayoftheYear {

  public int dayOfYear(String date) {
    int[] sumOfDaysPassedOnEachMonth = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    int day = Integer.parseInt(date.split("-")[2]);
    int month = Integer.parseInt(date.split("-")[1]);
    int year = Integer.parseInt(date.split("-")[0]);

    int result = day + sumOfDaysPassedOnEachMonth[month - 1];

    return year % 4 == 0 && month > 2 ? result + 1 : result;
  }
}

/*class Solution {
    public double angleClock(int hour, int minutes) {
        double minuteAngle = 6.0 * minutes;
        double hourAngle = 30.0 * (hour % 12) + 0.5 * minutes;

        double diff = Math.abs(hourAngle - minuteAngle);

        return Math.min(diff, 360.0 - diff);
    }
}*/

class Solution {
  public double angleClock(int hour, int minutes) {
    final double hourHand = (hour % 12 + minutes / 60.0) * 30;
    final double minuteHand = minutes * 6;
    final double diff = Math.abs(hourHand - minuteHand);
    return Math.min(diff, 360 - diff);
  }
}
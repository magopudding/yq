/**
 * @ClassName: GasStation
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2020/11/18 16:08
 * @Version 1.0
 **/
public class GasStation {

  public static void main(String[] args) {
    GasStation gs = new GasStation();
    int[] gas  = {5,1,2,3,4};
    int[] cost = {4,4,1,5,1};
    System.out.println(gs.canCompleteCircuit(gas,cost));
  }
  /*
   *
   * @Author kongxiangyun
   * @Description leetcode no134 加油站
   * @Date  2020/11/18 16:08
   * @Param [gas, cost]
   * @return int
   **/
  public int canCompleteCircuit(int[] gas, int[] cost) {
    if(gas.length == 0 || cost.length == 0){
      return -1;
    }
    int i =0;
    int j = 0;
    int costj;
    int gasLen = gas.length;
    int c1 = 0;
    for(;i<gasLen;i++){
      if(gas[i] < cost[i]){
        continue;
      }
      int targetS = i;
      c1 = c1 + gas[i];
      j = i;
      while (c1 >= 0){
        costj = j;
        if(j >= gasLen - 1){
          j = 0;
        }else {
          j++;
        }
        if((c1 -= cost[costj]) < 0){
          break;
        }
        c1 += gas[j];
        if(c1 < 0){
          break;
        }
        if(j == targetS){
          return j;
        }
      }
      c1 = 0;
    }
    return  -1;
  }


  public int  canCompleteCircuit2(int[] gas, int[] cost) {
    {
      int n = gas.length;
      int i = 0;
      while (i < n) {
        int sumOfGas = 0, sumOfCost = 0;
        int cnt = 0;
        while (cnt < n) {
          int j = (i + cnt) % n;
          sumOfGas += gas[j];
          sumOfCost += cost[j];
          if (sumOfCost > sumOfGas) {
            break;
          }
          cnt++;
        }
        if (cnt == n) {
          return i;
        } else {
          i = i + cnt + 1;
        }
      }
      return -1;
    }
  }
}

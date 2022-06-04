// Time Complexity : 
// Space Complexity :
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>());
        return result;
    }
    private void helper(int[] candidates, int target, int index, List<Integer> path){
        for(int i = index; i < candidates.length; i++){
            path.add(candidates[i]);
            int temp = target - candidates[i];
            if(temp == 0){
                result.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
                continue;
            }
            if(temp < 0){
                path.remove(path.size() - 1);
                continue;
            }
            helper(candidates, temp, i, path);
            path.remove(path.size() - 1);
        }
    }
    
}
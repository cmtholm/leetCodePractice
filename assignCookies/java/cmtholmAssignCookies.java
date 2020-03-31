/**
 *  Naive thought: Brute force. Would make removing 'eaten' cookies 
 *  more complex. ..would be easier to sort and then iterate
 * 
 *  Probably efficient solution: Sort each array, iterate through, incrementing
 *  child only when a cookie has been found for that child of sufficient size.
 * 
 *  Time Complexity: max(gLog(g),sLog(s)) for the sorting
 *  Space Complexity: O(1) assuming java sort sorts arrays in place.
 *
 *  Submission link: https://leetcode.com/submissions/detail/317897684/
 * 
 */
class Solution {
    public int findContentChildren(int[] g, int[] s) {
      int numContent = 0;
      int childIdx = 0;
      int cookieIdx = 0;
      
      Arrays.sort(g);
      Arrays.sort(s);
      int child;
      int cookie;
      
      while (childIdx < g.length && cookieIdx < s.length) {
        child = g[childIdx];
        cookie = s[cookieIdx];
        
        if (child <= cookie) {
          numContent++;
          childIdx++;
        }
        cookieIdx++;
      }
      return numContent;
    }
}

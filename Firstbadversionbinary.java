public class Firstbadversionbinary {
    public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1,r=Integer.MAX_VALUE;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(isBadVersion(mid))
            r=mid-1;
            else
            l=mid+1;
        }
        return l;
        
    }
}
    
}

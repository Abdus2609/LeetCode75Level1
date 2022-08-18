public class P14FirstBadVersion {
    public static int firstBadVersion(int n) {
        int startVersion = 1;
        int endVersion = n;
        int currVersion = 1;
        
        while (startVersion <= endVersion) {
            int mid = startVersion + (endVersion - startVersion) / 2;
            if (isBadVersion(mid)) {
                currVersion = mid;
                endVersion = mid - 1;
            } else {
                startVersion = mid + 1;
            }
        }
        
        return currVersion;
    }

    private static boolean isBadVersion(int version) {
        return false;
    }
}

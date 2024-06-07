class Solution {
    public List<String> removeSubfolders(String[] folder) {
                // Sort the folders
        Arrays.sort(folder);
        
        List<String> result = new ArrayList<>();
        String lastAdded = "";

        for (String dir : folder) {
            // Check if the current folder is a sub-folder of the last added folder
            if (lastAdded.isEmpty() || !dir.startsWith(lastAdded + "/")) {
                result.add(dir);
                lastAdded = dir;
            }
        }

        return result;
    }
}
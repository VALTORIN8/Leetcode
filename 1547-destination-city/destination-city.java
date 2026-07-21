class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> in = new HashSet<>();
        HashSet<String> out = new HashSet<>();

        for (List<String> path : paths) {
            in.add(path.get(0));
            out.add(path.get(1));
        }
        for (String city : in) {
            out.remove(city);
        }
        //set print krwa de return in krke dekh//return in .element how?//return krna hog
        return out.iterator().next();
        //ohh 
    }
}
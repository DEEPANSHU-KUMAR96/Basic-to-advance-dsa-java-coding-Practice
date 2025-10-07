class CollectionVarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Deepanshu"));
        System.out.println(concatenate("Deepanshu","coder"));

    }
    public static String concatenate(String...strs)
    {
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append (str).append(" ");
        }
        return sb.toString();
    }
}

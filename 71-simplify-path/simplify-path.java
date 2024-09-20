import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");

        Stack<String> stack = new Stack<>();

        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            }
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder res = new StringBuilder();
        for (String dir : stack) {
            res.append("/").append(dir);
        }

        return res.toString();
    }
}

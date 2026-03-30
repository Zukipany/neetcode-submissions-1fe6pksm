public boolean isAnagram(String s, String t) {
        int lns = s.length();

        if (lns != t.length()) {
            return false;
        }

        String[] charS = new String[lns];

        for (int i = 0; i < lns; i++) {
            charS[i] = String.valueOf(s.charAt(i));
        }

        for (int i = 0; i < lns; i++) {
            boolean found = false;
            String current = String.valueOf(t.charAt(i));

            for (int j = 0; j < lns - i; j++) {
                if (current.equals(charS[j])) {
                    for (int k = j; k < lns - i - 1; k++) {
                        charS[k] = charS[k + 1];
                    }
                    charS[lns - i - 1] = null;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }
        return true;
    }
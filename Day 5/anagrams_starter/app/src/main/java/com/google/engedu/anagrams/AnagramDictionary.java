/* Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.engedu.anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class AnagramDictionary {

    private static final int MIN_NUM_ANAGRAMS = 5;
    private static final int DEFAULT_WORD_LENGTH = 3;
    private static final int MAX_WORD_LENGTH = 7;
    private Random random = new Random();

    private ArrayList<String> wordList = new ArrayList<>();
    private HashSet<String> wordSet = new HashSet<>();
    private HashMap<String , ArrayList<String>> lettersToWord = new HashMap<>();

    public AnagramDictionary(Reader reader) throws IOException {
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine()) != null) {
            String word = line.trim();
            wordList.add(word);

            wordSet.add(word);
            String sortedWord = sortLetters(word);

            if (lettersToWord.containsKey(sortedWord)) {
                lettersToWord.get(sortedWord).add(word);
            }
            else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(word);
                lettersToWord.put(sortedWord , temp);
            }
        }
    }

    public boolean isGoodWord(String word, String base) {
        return !word.contains(base) && wordSet.contains(word);
    }

    public List<String> getAnagrams(String targetWord) {
        ArrayList<String> result = new ArrayList<String>();

        String sortedTargetWord = sortLetters(targetWord);

        for (String word : wordList) {
            String sortedWord = sortLetters(word);

            if (sortedTargetWord.equals(sortedWord)) {
                result.add(word);
            }
        }
        return result;
    }

    public List<String> getAnagramsWithOneMoreLetter(String word) {
        ArrayList<String> result = new ArrayList<String>();
        return result;
    }

    public String pickGoodStarterWord() {
        return "stop";
    }

    private String sortLetters(String target) {
        char[] tempArray = target.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ely likes to play Pokémon Go a lot. But Pokémon Go went bankrupt… So, the developers made Pokémon Don't Go out of depression.
        // And so, Ely now plays Pokémon Don't Go. In Pokémon Don't Go, when you walk to a certain Pokémon, those closest to you naturally get further, and those further from you get closer.
        //You will receive a sequence of integers, separated by spaces - the distances to the Pokémons.
        //Then you will begin receiving integers corresponding to indexes in that sequence.
        //When you receive an index, you must remove the element at that index from the sequence (as if you've captured the Pokémon).
        //    • You must INCREASE the value of all elements in the sequence which are LESS or EQUAL to the removed element with the value of the removed element.
        //    • You must DECREASE the value of all elements in the sequence which are GREATER than the removed element with the value of the removed element.
        //If the given index is LESS than 0, remove the first element of the sequence, and COPY the last element to its place.
        //If the given index is GREATER than the last index of the sequence, remove the last element from the sequence, and COPY the first element to its place.
        //The increasing and decreasing of elements should be done in these cases, also. The element whose value you should use is the REMOVED element.
        //The program ends when the sequence has no elements (there are no Pokémons left for Ely to catch).

        List<Integer> arrList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int totalSum = 0;
        int currentIndexValue = 0;
        while(arrList.size() > 0 ){
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0){
                arrList.remove(0);
                arrList.set(0,arrList.get(arrList.size()-1));
                continue;
            }else if (index >= arrList.size()){
                int toBeRemoved = arrList.get(arrList.size()-1);
                totalSum += toBeRemoved;
                arrList.remove(arrList.size()-1);
                currentIndexValue = toBeRemoved;
                arrList.add(arrList.size(),arrList.get(0));
                index = arrList.size();

            }else {
                currentIndexValue = arrList.get(index);
                totalSum += arrList.get(index);
                arrList.remove(index);
            }

            for (int i = 0; i < arrList.size(); i++) {
                if (arrList.get(i) <= currentIndexValue){
                    int sumIndex = arrList.get(i) + currentIndexValue;
                    arrList.set(i,sumIndex);
                }else if (arrList.get(i) > currentIndexValue){
                    int minusIndex = arrList.get(i) - currentIndexValue;
                    arrList.set(i,minusIndex);
                }
            }
        }
        System.out.println(totalSum);
    }
}

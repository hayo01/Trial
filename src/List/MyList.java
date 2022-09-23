package List;

import java.util.NoSuchElementException;

public class MyList<E> {

    private Integer length;
    private Item firstItem;
    private Item lastItem;

    /*
    1. 문자열을 모두 소문자로 변환
    2. for문을 사용하여 두 비교대상의 각 자리별 문자의 Ascii 코드 비교
    2-1. Integer.parseInt() 와 .charAt() 활용 >> 문자를 Ascii 코드로 변환
    3. (A값 - B값) 의 결과가 음수이면, B>A
                         양수이면, A>B
     */
    public Item sort(String name){
        int midItemNo = length/2;
        Item midItem = firstItem;

        int count = 1;
        while(count < midItemNo){
            midItem = midItem.nextLink; //중간위치 아이템 획득
            count++;
        }



        return null;
    }



    public void push(Item p_item){
        if(firstItem == null){  //처음으로 들어오는 아이템
            firstItem = p_item; lastItem = p_item;
            length++;
            return;
        }

        Item findItem = firstItem;
        while (findItem.nextLink != null){
            findItem = findItem.nextLink;
        }

        p_item.preLink = findItem;
        findItem.nextLink = p_item;
        lastItem = p_item;
        length++;
    }

    public Item pop(){  //1.lastItem pop    2.String    3.Integer
        Item leftItem = lastItem.preLink;
        leftItem.nextLink = null;
        return lastItem;

//        while (findItem.nextLink != null){
//            prevItem = findItem;
//            findItem = findItem.nextLink;
//        }
//        if(prevItem != null) prevItem.nextLink = null;
//        return findItem;
    }

    public void updateLinks(Item findItem){
        Item leftItem = findItem.preLink;
        Item rightItem = findItem.nextLink;

        if (leftItem != null)
            leftItem.nextLink = rightItem;

        if (rightItem != null)
            rightItem.preLink = leftItem;
    }

    /*
    1. String 값을 이용하여 Item 찾기
    2. 해당 아이템 return
    3. 해당 아이템의 앞,뒤 아이템들을 연결
     */
    public Item pop(String p_data){
        Item findItem = firstItem;

        while (findItem.nextLink != null){
            if(findItem.data.equals(p_data)){
                updateLinks(findItem);
                break;
            }

            findItem = findItem.nextLink;
        }
        return findItem;
    }

    public Item pop(Integer index){
        Item findItem = firstItem;
        Integer count = 0;

        while (findItem.nextLink != null){
            if(count.equals(index)){
                updateLinks(findItem);
                break;
            }
            count++;
            findItem = findItem.nextLink;
        }
        return findItem;
    }
}

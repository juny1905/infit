package com.brainyoung.ryan.arabang;

import java.util.ArrayList;
import java.util.Arrays;

public class Style_Info {
    static ArrayList roomNames = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
    static ArrayList minimal_rooms = new ArrayList<>(Arrays.asList(
            R.mipmap.image_minimal_1, R.mipmap.image_minimal_2, R.mipmap.image_minimal_3, R.mipmap.image_minimal_4,
            R.mipmap.image_minimal_5, R.mipmap.image_minimal_6, R.mipmap.image_minimal_7, R.mipmap.image_minimal_8,
            R.mipmap.image_minimal_9));
    static ArrayList classic_rooms = new ArrayList<>(Arrays.asList(
            R.mipmap.image_classic_1, R.mipmap.image_classic_2, R.mipmap.image_classic_3, R.mipmap.image_classic_4,
            R.mipmap.image_classic_5, R.mipmap.image_classic_6, R.mipmap.image_classic_7, R.mipmap.image_classic_8,
            R.mipmap.image_classic_9));
    static ArrayList hightech_rooms = new ArrayList<>(Arrays.asList(
            R.mipmap.image_hightech_1, R.mipmap.image_hightech_2, R.mipmap.image_hightech_3, R.mipmap.image_hightech_4,
            R.mipmap.image_hightech_5, R.mipmap.image_hightech_6, R.mipmap.image_hightech_7, R.mipmap.image_hightech_8,
            R.mipmap.image_hightech_9));
    static ArrayList romantic_rooms = new ArrayList<>(Arrays.asList(
            R.mipmap.image_romantic_1, R.mipmap.image_romantic_2, R.mipmap.image_romantic_3, R.mipmap.image_romantic_4,
            R.mipmap.image_romantic_5, R.mipmap.image_romantic_6, R.mipmap.image_romantic_7, R.mipmap.image_romantic_8,
            R.mipmap.image_romantic_9));
    static ArrayList modern_rooms = new ArrayList<>(Arrays.asList(
            R.mipmap.image_modern_1, R.mipmap.image_modern_2, R.mipmap.image_modern_3, R.mipmap.image_modern_4,
            R.mipmap.image_modern_5, R.mipmap.image_modern_6, R.mipmap.image_modern_7, R.mipmap.image_modern_8,
            R.mipmap.image_modern_9));
    static ArrayList elegance_rooms = new ArrayList<>(Arrays.asList(
            R.mipmap.image_elegance_1, R.mipmap.image_elegance_2, R.mipmap.image_elegance_3, R.mipmap.image_elegance_4,
            R.mipmap.image_elegance_5, R.mipmap.image_elegance_6, R.mipmap.image_elegance_7, R.mipmap.image_elegance_8,
            R.mipmap.image_elegance_9));
    static int[] index_to_id = {
            R.mipmap.romantic_sized_600,
            R.mipmap.ic_launcher,
            R.mipmap.classic_sized_600,
            R.mipmap.hightech_sized_600,
            R.mipmap.elegance_sized_600,
            R.mipmap.ic_launcher,
            R.mipmap.modern_sized_600,
            R.mipmap.minimal_sized_600,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
    };
    static int[] index_to_cloud = {
            R.mipmap.wordcloud_romantic,
            R.mipmap.ic_launcher,
            R.mipmap.wordcloud_classic,
            R.mipmap.wordcloud_hightech, // Hightech
            R.mipmap.wordcloud_elegance,
            R.mipmap.ic_launcher,
            R.mipmap.wordcloud_modern,
            R.mipmap.wordcloud_minimal,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
    };
    static String[] Styles_description = {
            "  흔히 알고 있는 아기자기하고 여성적인 느낌,\n사랑스러운 핑크톤의 공주풍 인테리어는\n로맨틱(Romantic) 스타일이다. 여성적인 곡선을\n강조하며 밝고 가벼우면서도\n부드럽게 표현한다. 화이트, 핑크를\n비롯한 은은한 컬러와 화려한 장식의\n소품이나 패브릭이 대표적이다.\n로맨틱 스타일 연출 방법은 여성스러운\n곡선을 가진 가구와 소품을 적절히\n배치하거나 실크, 벨벳 등의 부드러운\n촉감의 패브릭을 매치시킨다.\n눈꽃문양의 패턴유리와 웨이브 패턴의 아트월,\n크리스털 느낌 등의 소품을\n활용하는 방법도 있다. 기본배색으로 소프트,\n라이트, 브라이트 톤이며 핑크,\n베이지, 옐로우, 오렌지 등을 사용한다. ",
            "전통적인 ...",
            "  클래식(Classic) 스타일은 일반적으로\n19c 까지의 양식을 총칭해서 클래식이라 부르며,\n클래식 스타일은 서양의 전통적인 양식으로\n기품있고 웅장하며 화려하며\n고급스러운 이미지를 풍긴다.\n전통을 고수하고 풍요롭고 여유있는\n생활을 원하고 장식적인 것을 좋아하는 계층,\n사회적으로 안정적인 계층의 사람들이\n선호하는 경향이 있다.\n간혹 고전영화를 보면 정통\n클래식 스타일을 엿볼 수 있다.\n격식을 차린 포멀한 느낌의 스타일이\n곧 클래식이다.",
            "  하이테크는 하이테크놀로지(Hi-technology)의\n축약어로 고도의 과학을 첨단 제품의\n생산에 적용하는 기술 형태를\n통틀어 이르는 말.\n공업 디자인 및 재료, 제품을 응용한\n가정용품의 디자인이나 기술.\n일반적 특성 하이테크 건축은 공간,\n구조, 설비 등의 가변성 개념과\n이것이 극도로 발전된 이동성의\n개념을 내포한다.\n이것은 경량의 규격화된 부재를\n대량 생산하여 어떤 한가지 구성체계로\n끼워 맞출 수 있는 system 건축을\n실현시킴으로써 가능한 개념이다.",
            "  엘레강스(Elegance) 스타일은 공주풍의\n로맨틱 스타일과 비슷하지만 보다\n우아하고 성숙함을 담고 있으며\n세련된 고급스러움을 보여준다.\n복잡한 문양의 디자인, 장식적 패턴,\n광택, 화려한 텍스처 등으로 표현되며\n귀족적인 분위기와 럭셔리한 공간을\n연출하는 골드나 브론즈톤의 색상이 잘 어울린다.\n여름과 가을 색상인 그레이쉬(회색톤)이나\n중명도의 무채색톤도 많이 사용하며\n그 밖에 퍼플, 와인, 베이지브라운 등의 컬러는\n우아하고 고풍스러움을 느끼게 한다. ",
            "고향의 ...",
            "  모던(Modern) 스타일은\n‘현대적’, ‘기능적’, ‘합리적’ 의미로\n19세기 말 20세기 초 유럽에서 일어난\n‘모더니즘(Modernism)’이라는 예술운동에서 나온 말이다.\n직선적이고 기능미가 돋보이며\n도시적, 합리적, 진보적 등의 이미지를 나타낸다.\n가장 큰 특징인 직선을 사용해\n비례와 리듬감을 살려 세련되게 표현하는데,\n절제된 기하학적인 곡선도 사용한다.\n장식적인 요소를 배제해 다소 차가운\n느낌을 주지만 소품과 컬러의 조화로\n풍성한 느낌을 줄 수 있다. ",
            "  미니멀(Minimal) 스타일은\n‘최소한도’라는 사전적 의미에 맞게\n장식이나 컬러를 최소한으로 사용함으로써\n극도의 절제미를 추구한다.\n간결함과 세련됨, 단순한 디자인에\n기능을 강조한다.\n기능적인 가구와 간결한 라인의\n붙박이장을 선호하며 곡선보다는 직선을,\n화려한 장식보다 실용성을,\n자연적인 소재보다는 인공적인 소재를 선호한다.\n최대한 간단하게 디자인하지만 필요한 요소는\n모두 갖춘 스타일이라고 할 수 있다.\n특히 차가운 질감의 금속과 유리를\n주로 사용하고 화이트, 크림색 등의\n모노톤이 주 컬러다.\n패턴은 최대한 배제하는 것이 원칙이다.\n조명은 간접조명이 적합하고\n주로 할로겐 매입등을 설치한다.\n흑백의 단순한 조화를 살린 가구와\n간결한 문양이 반복적으로 나타난 벽지와\n바닥재, 무늬가 없거나 기하학적인\n직선 형태의 소품으로\n미니멀 스타일을 표현할 수 있다.\n최근에는 근본적, 자연적인 것에 대한\n관심이 높아져 자연 친화적인 요소를\n공간에 도입하고 있다. ",
            "자연과 함께...",
            "간편한 ..."
    };
    static String[] Styles = { // 0,1,2,6,7,9
            "로맨틱", // 이란
            "에스닉", // 이란
            "클래식", // 이란
            "하이테크",  // 란
            "엘레강스", // 란
            "컨트리", // 란
            "모던", // 이란
            "미니멀", // 이란
            "내츄럴", // 란
            "캐주얼" // 이란
    };
   static int[][] Style_Places = {
            {2, 3, 6}, // ESTJ
            {2, 3, 7}, // ESTP
            {2, 3, 0}, // ESFP
            {2, 3, 0}, // ESFJ
            {2, 0, 6}, // ENTJ
            {2, 0, 6}, // ENTP
            {2, 0, 4}, // ENFJ
            {2, 0, 7}, // ENFP
            {7, 3, 6}, // ISTJ
            {7, 3, 2}, // ISTP
            {7, 3, 0}, // ISFJ
            {7, 3, 0}, // ISFP
            {7, 0, 6}, // INTJ
            {7, 0, 6}, // INTP
            {7, 0, 2}, // INFJ
            {7, 0, 6}, // INFP
    };

}

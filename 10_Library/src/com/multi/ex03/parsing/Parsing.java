package com.multi.ex03.parsing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.kobis.or.kr/kobisopenapi/homepg/apiservice/searchServiceInfo.do
// http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101

//------------------------------------------------
// 1위 : 미션임파서블, 누적관객수 : 5328435
// 2위 : 셜록홈즈 , 누적관객수 : 1442861
// 3위 : 마이 웨이, 누적관객수 : 1739543
// 4위 : 퍼펙트 게임, 누적관객수 : 895416
// 5위 : 프렌즈, 누적관객수 : 202909
// 6위 : 오싹한 연애, 누적관객수 : 2823060
// 7위 : 라이온 킹, 누적관객수 : 171285
// 8위 : 극장판 포켓몬스터 베스트 위시「비크티니와 백의 영웅 레시라무」, 누적관객수 : 285959
// 9위 : 앨빈과 슈퍼밴드3, 누적관객수 : 516289
// 10위 : 극장판 포켓몬스터 베스트 위시 「비크티니와 흑의 영웅 제크로무」, 누적관객수 : 235070
//------------------------------------------------

// 해석하다. 컴퓨터 용어 : 외부에 있는 특정 Form 파일(HTML, XML, JSON, CSV)를 데이터화 하는 작업
public class Parsing {

	static String text = "{\"boxOfficeResult\":{\"boxofficeType\":\"주말 박스오피스\",\"showRange\":\"20111230~20120101\",\"yearWeekTime\":\"201152\",\"weeklyBoxOfficeList\":[{\"rnum\":\"1\",\"rank\":\"1\",\"rankInten\":\"0\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20112207\",\"movieNm\":\"미션임파서블:고스트프로토콜\",\"openDt\":\"2011-12-15\",\"salesAmt\":\"7840509500\",\"salesShare\":\"35.8\",\"salesInten\":\"-1706758500\",\"salesChange\":\"-17.9\",\"salesAcc\":\"40541108500\",\"audiCnt\":\"1007683\",\"audiInten\":\"-234848\",\"audiChange\":\"-18.9\",\"audiAcc\":\"5328435\",\"scrnCnt\":\"697\",\"showCnt\":\"9677\"},{\"rnum\":\"2\",\"rank\":\"2\",\"rankInten\":\"1\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20112621\",\"movieNm\":\"셜록홈즈 : 그림자 게임\",\"openDt\":\"2011-12-21\",\"salesAmt\":\"3436042500\",\"salesShare\":\"15.7\",\"salesInten\":\"-576328500\",\"salesChange\":\"-14.4\",\"salesAcc\":\"10678327500\",\"audiCnt\":\"453533\",\"audiInten\":\"-83422\",\"audiChange\":\"-15.5\",\"audiAcc\":\"1442861\",\"scrnCnt\":\"363\",\"showCnt\":\"5589\"},{\"rnum\":\"3\",\"rank\":\"3\",\"rankInten\":\"-1\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20110295\",\"movieNm\":\"마이 웨이\",\"openDt\":\"2011-12-21\",\"salesAmt\":\"3195903000\",\"salesShare\":\"14.6\",\"salesInten\":\"-2754931500\",\"salesChange\":\"-46.3\",\"salesAcc\":\"13002897500\",\"audiCnt\":\"417395\",\"audiInten\":\"-369911\",\"audiChange\":\"-47.0\",\"audiAcc\":\"1739543\",\"scrnCnt\":\"605\",\"showCnt\":\"7318\"},{\"rnum\":\"4\",\"rank\":\"4\",\"rankInten\":\"0\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20113260\",\"movieNm\":\"퍼펙트 게임\",\"openDt\":\"2011-12-21\",\"salesAmt\":\"1816656000\",\"salesShare\":\"8.3\",\"salesInten\":\"-829977000\",\"salesChange\":\"-31.4\",\"salesAcc\":\"6640940000\",\"audiCnt\":\"240133\",\"audiInten\":\"-109651\",\"audiChange\":\"-31.3\",\"audiAcc\":\"895416\",\"scrnCnt\":\"396\",\"showCnt\":\"4232\"},{\"rnum\":\"5\",\"rank\":\"5\",\"rankInten\":\"11\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20113271\",\"movieNm\":\"프렌즈: 몬스터섬의비밀 \",\"openDt\":\"2011-12-29\",\"salesAmt\":\"1255253000\",\"salesShare\":\"5.7\",\"salesInten\":\"1244095000\",\"salesChange\":\"11149.8\",\"salesAcc\":\"1523037000\",\"audiCnt\":\"165958\",\"audiInten\":\"164571\",\"audiChange\":\"11865.2\",\"audiAcc\":\"202909\",\"scrnCnt\":\"297\",\"showCnt\":\"2379\"},{\"rnum\":\"6\",\"rank\":\"6\",\"rankInten\":\"-1\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20113381\",\"movieNm\":\"오싹한 연애\",\"openDt\":\"2011-12-01\",\"salesAmt\":\"1119236000\",\"salesShare\":\"5.1\",\"salesInten\":\"-288539500\",\"salesChange\":\"-20.5\",\"salesAcc\":\"20634684500\",\"audiCnt\":\"150185\",\"audiInten\":\"-44816\",\"audiChange\":\"-23.0\",\"audiAcc\":\"2823060\",\"scrnCnt\":\"254\",\"showCnt\":\"2638\"},{\"rnum\":\"7\",\"rank\":\"7\",\"rankInten\":\"0\",\"rankOldAndNew\":\"NEW\",\"movieCd\":\"19940256\",\"movieNm\":\"라이온 킹\",\"openDt\":\"1994-07-02\",\"salesAmt\":\"1503865000\",\"salesShare\":\"6.9\",\"salesInten\":\"1503865000\",\"salesChange\":\"100.0\",\"salesAcc\":\"1841625000\",\"audiCnt\":\"139102\",\"audiInten\":\"139102\",\"audiChange\":\"100.0\",\"audiAcc\":\"171285\",\"scrnCnt\":\"246\",\"showCnt\":\"2661\"},{\"rnum\":\"8\",\"rank\":\"8\",\"rankInten\":\"-1\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20112709\",\"movieNm\":\"극장판 포켓몬스터 베스트 위시「비크티니와 백의 영웅 레시라무」\",\"openDt\":\"2011-12-22\",\"salesAmt\":\"508658000\",\"salesShare\":\"2.3\",\"salesInten\":\"-379868500\",\"salesChange\":\"-42.8\",\"salesAcc\":\"1897120000\",\"audiCnt\":\"75654\",\"audiInten\":\"-57269\",\"audiChange\":\"-43.1\",\"audiAcc\":\"285959\",\"scrnCnt\":\"186\",\"showCnt\":\"999\"},{\"rnum\":\"9\",\"rank\":\"9\",\"rankInten\":\"-3\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20113311\",\"movieNm\":\"앨빈과 슈퍼밴드3\",\"openDt\":\"2011-12-15\",\"salesAmt\":\"407125000\",\"salesShare\":\"1.9\",\"salesInten\":\"-697653500\",\"salesChange\":\"-63.1\",\"salesAcc\":\"3416675000\",\"audiCnt\":\"60990\",\"audiInten\":\"-104962\",\"audiChange\":\"-63.2\",\"audiAcc\":\"516289\",\"scrnCnt\":\"169\",\"showCnt\":\"968\"},{\"rnum\":\"10\",\"rank\":\"10\",\"rankInten\":\"-2\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20112708\",\"movieNm\":\"극장판 포켓몬스터 베스트 위시 「비크티니와 흑의 영웅 제크로무」\",\"openDt\":\"2011-12-22\",\"salesAmt\":\"390720500\",\"salesShare\":\"1.8\",\"salesInten\":\"-396267500\",\"salesChange\":\"-50.4\",\"salesAcc\":\"1595695000\",\"audiCnt\":\"56991\",\"audiInten\":\"-57966\",\"audiChange\":\"-50.4\",\"audiAcc\":\"235070\",\"scrnCnt\":\"175\",\"showCnt\":\"832\"}]}}";

	public static void main(String[] args) {
		String[] array1 = text.split("\\[");
		for(String str : array1) {
			System.out.println(str);
		}
		System.out.println("Header 분리 완료!");
		
		text = text.split("\\[")[1];
		String[] array2 = text.split("\\]");
		for(String str : array2) {
			System.out.println(str);
		}
		System.out.println("Tail 분리 완료");
		
		String body = text.split("\\]")[0];
//		System.out.println(body);
		String[] infoArray = body.split("},");
		for(String str : infoArray) {
			System.out.println(str);
		}
		// 정보 단위로 자르기 성공

		System.out.println("-------------------------------------------------");
		// 정보 단위에서 쓰레기 문자 제거
		for(int i = 0; i < infoArray.length; i++) {
			infoArray[i] = infoArray[i].replace("{", "").replace("}", "").strip();
			System.out.println(infoArray[i]);
		}
		System.out.println("정보단위 쓰레기 값 제거 완료!");
		
		// 컬랙션으로 Key-Value 형태로 모으기 나중에 배울예정
		List<Map<String,String>> list = new ArrayList<>();
		for(String str : infoArray) {
//			System.out.println(str);
			String[] array3 = str.split(",");
			Map<String,String> map = new HashMap<>();
			for(String str2 : array3) {
//				System.out.println(str2);
				String key = str2.split(":")[0].replace("\"","");
				String value = str2.split(":")[1].replace("\"","");
				map.put(key, value);
			}
			list.add(map);
		}
		for(Map<String, String> map : list) {
			System.out.println(map);
		}
		System.out.println("컬렉션화 완료");
		
		System.out.println("------------------------------------------------");
		// 순위, 이름, 관객수
		for(Map<String, String> map : list) {
			String str = map.get("rank") + "위 : " + map.get("movieNm") + ", 누적관객수 : " + map.get("audiAcc");
			System.out.println(str);
		}
		System.out.println("------------------------------------------------");
		
		
	}
}
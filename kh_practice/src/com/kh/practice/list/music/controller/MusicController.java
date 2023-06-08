package com.kh.practice.list.music.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();

	/*public MusicController() {
		//music.txt 파일에서 읽어서 list에 추가하여 초기화함.
		//filePath에 list의 Music 객체들은 저장한.
		String filePath "music.txt";
		try (ObjectOutputStream ois 
				= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
			){
			list = (List<music>)
			list = (List<Music>)ois.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		불
	}*/
	
	
	
	public MusicController() {
		// list에 초기 곡 10곡 미리 입력해두기
		list.add(new Music("aa", "aaa"));
		list.add(new Music("bb", "bbb"));
		list.add(new Music("cc", "ccc"));
		list.add(new Music("dd", "ddd"));
		list.add(new Music("aa", "eee"));
		list.add(new Music("bb", "fff"));
		list.add(new Music("cc", "aaa"));
		list.add(new Music("dd", "bbb"));
		list.add(new Music("ee", "ccc"));
		list.add(new Music("ff", "ddd"));
	}

	public int addList(Music music) {
//		****** 마지막 위치에 곡 추가 ******
		int result = 0; // 0:추가실패, 1:추가성공
		if (list.add(music)) {
			result = 1;
		}
		return result;
	}

	public int addAtZero(Music music) {
//		****** 첫 위치에 곡 추가 ******
		int result = 0; // 0:추가실패, 1이상:추가성공
		int cnt = list.size();
		((ArrayList<Music>) list).add(0, music);
		int cntAfter = list.size();
		if (cnt < cntAfter) {
			result = cntAfter - cnt;
		}
		return result;
	}

	public List<Music> printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		Music result = null;
		for (Music vo : list) {
			if (vo.getTitle().equals(title)) {
				result = vo;
				break;
			}
		}
		return result;
	}

	public Music removeMusic(String title) {
		Music result = null;
		for (Music vo : list) {
			if (vo.getTitle().equals(title)) {// title이 같은 것을찾아
				list.remove(vo);// 삭제
				result = vo;// 찾은Music객체vo를 return하면됨.
				break;
			}
		}
		return result;
	}

	public Music setMusic(String title, Music music) {
		Music result = null;
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getTitle().equals(title)) {
//				result = list.get(i);
//				list.set(i, music);
//				break;
//			}
//			
//	}
//	}
		for (Music vo : list) {
			if (vo.getTitle().equals(title)) {
				result = vo;
//				vo = music;불가 vo는 for 문의 새로운 지역변수로 list와는 무관한공간임
				int findidx = list.indexOf(vo);
				list.set(findidx, music);
				break;
			}
		}
		return result;
	}

	public int ascTitle() {
		int result = 0;
		try {
			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = 0; j < list.size() - 1 - i; j++) {
					if (list.get(j).getTitle().compareTo(list.get(j + 1).getTitle()) > 0) {
						Music tmp = list.get(j);
						list.set(j, list.get(j + 1));
						list.set(j + 1, tmp);

					}
				}
			}
			result = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public int descSinger() {
		// list 에서 singer (list에 singer는 없음, 1개의 객체에서 singer있다.)
//		list.get(0).getSinger();
		int result = 0;
		try {

			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = 0; j < list.size() - 1 - i; j++) {
					if (list.get(j).getSinger().compareTo(list.get(j + 1).getSinger()) < 0) {
						// 정렬기준은 list의 Music 형태의 객체중 singer 값으로 비교함.
						Music tmp = list.get(j); // SWAP LIST에 있는 MUSIC형태의 객체를 swap
						list.set(j, list.get(j + 1));
						list.set(j + 1, tmp);
					}
				}
			}
			result = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int ascTilte2() {
		int result = 0;
//		ArrayList arraylist = new ArrayList<Music>();
//		arrlist.add(new Music("a","vb"));
//		list.removeAll(arrlist)
		Collections.sort(list, new AscTitle());
		return result;
	}

	public int decTilte2() {
		int result = 0;
		Collections.sort(list);
		return result;
	}

	public int saveFile(String filePath) {
		int result = 0; // 0 : 저장실패, 1: 저장성공
		/*
		 * FileOutputStream fos = null; BufferedOutputStream bos =null;
		 */
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath))); ){
			/*
			 * fos = new FileOutputStream (filePath); bos = new BufferedOutputStream(oos);
			 * oos = new ObjectOutputStream (fos);
			 
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
*/
			// filePath에 list의 Music 객체들을 저장함.
			oos.writeObject(list);
			oos.flush();
			result = 1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} /*finally {
			try {
				if (oos != null)
					oos.close();
				/*	if (bos != null)
					bos.close();
				if (fos != null)
					fos.close();

			} catch (IOException e) {
				e.printStackTrace();

			}
		}*/

		return result;

	}
	
	public int loadFile(String filePath) {
		int result =0;
		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));){
			list = (List<Music>)ois.readObject();
			System.out.println(list);
			result = 1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
}
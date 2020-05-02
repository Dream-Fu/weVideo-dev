package com.weVideo.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MergeVideoMp3 {

	private String ffmpegEXE;
	
	public MergeVideoMp3(String ffmpegEXE) {
		super();
		this.ffmpegEXE = ffmpegEXE;
	}
	
	public void clear(String videoInputPath, String mp3InputPath,
			double seconds, String videoOutputPath) throws Exception {
//		ffmpeg.exe -i 苏州大裤衩.mp4 -vcodec copy -an 新的视频.mp4
		List<String> command = new ArrayList<>();
		command.add(ffmpegEXE);
		
		command.add("-i");
		command.add(videoInputPath);
		
		command.add("-an");
		
		command.add(videoOutputPath);
		
		ProcessBuilder builder = new ProcessBuilder(command);
		Process process = builder.start();
		
		InputStream errorStream = process.getErrorStream();
		InputStreamReader inputStreamReader = new InputStreamReader(errorStream);
		BufferedReader br = new BufferedReader(inputStreamReader);
		
		String line = "";
		while ( (line = br.readLine()) != null ) {
		}
		
		if (br != null) {
			br.close();
		}
		if (inputStreamReader != null) {
			inputStreamReader.close();
		}
		if (errorStream != null) {
			errorStream.close();
		}
		
	}
	
	public void convertor(String mp3InputPath, String videoInputPath,
			double seconds, String videoOutputPath) throws Exception {
//		ffmpeg.exe -i mp3 -i mp4 -t 7 -y 新的视频.mp4
		List<String> command = new ArrayList<>();
		command.add(ffmpegEXE);
		
		command.add("-i");
		command.add(mp3InputPath);
		
		command.add("-i");
		command.add(videoInputPath);
		
		command.add("-t");
		command.add(String.valueOf(seconds));
		
		command.add("-y");
		command.add(videoOutputPath);
		
//		for (String c : command) {
//			System.out.print(c + " ");
//		}
		
		ProcessBuilder builder = new ProcessBuilder(command);
		Process process = builder.start();
		
		InputStream errorStream = process.getErrorStream();
		InputStreamReader inputStreamReader = new InputStreamReader(errorStream);
		BufferedReader br = new BufferedReader(inputStreamReader);
		
		String line = "";
		while ( (line = br.readLine()) != null ) {
		}
		
		if (br != null) {
			br.close();
		}
		if (inputStreamReader != null) {
			inputStreamReader.close();
		}
		if (errorStream != null) {
			errorStream.close();
		}
		
	}

	public static void main(String[] args) {
		MergeVideoMp3 ffmpeg = new MergeVideoMp3("G:\\wevideo_res\\ffmpeg\\bin\\ffmpeg.exe");
		try {
			//ffmpeg.clear("G:\\wevideo_res\\200329BZ74SRM8ZC\\video\\1.mp4", "G:\\wevideo_res\\bgm\\Unity.mp3", 7.1, "G:\\wevideo_res\\200329BZ74SRM8ZC\\video\\这是通过java生产的视频.mp4");
			ffmpeg.convertor( "G:\\wevideo_res\\bgm\\Unity.mp3","G:\\wevideo_res\\200329BZ74SRM8ZC\\video\\1.mp4", 7.1, "G:\\wevideo_res\\200329BZ74SRM8ZC\\video\\2.mp4");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

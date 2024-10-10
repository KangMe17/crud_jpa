package webct2.services;

import java.util.List;

import webct2.entity.Video;

public interface IVideoService {
	int count();

	List<Video> findAll(int page, int pagesize);

	List<Video> findByVidTitle(String title);

	List<Video> findAll();

	Video findById(String id);

	void delete(String id) throws Exception;

	void update(Video video);

	void insert(Video video);
}

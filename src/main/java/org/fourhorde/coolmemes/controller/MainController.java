package org.fourhorde.coolmemes.controller;

import org.fourhorde.coolmemes.csv.OpenCSVReadToBean;
import org.fourhorde.coolmemes.model.SnapshotModel;
import org.fourhorde.coolmemes.repos.SnapshotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private SnapshotRepository snapshotRepository;

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<SnapshotModel> snapshots = snapshotRepository.findAll();
        model.put("snapshots", snapshots);
        return "main";
    }

    @PostMapping("/upload_csv")
    public String uploadCSV(Map<String, Object> model, @RequestParam("file") MultipartFile file) {
        try {
            List<SnapshotModel> list = OpenCSVReadToBean.read(file);
            snapshotRepository.saveAll(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Iterable<SnapshotModel> snapshots = snapshotRepository.findAll();
        model.put("snapshots", snapshots);
        return "main";
    }

    @PostMapping
    public String add(
            Map<String, Object> model,
            @RequestParam String snapshot_views_count,
            @RequestParam String snapshot_likes_count,
            @RequestParam String snapshot_dislikes_count,
            @RequestParam String snapshot_comments_count,
            @RequestParam String snapshot_timestamp,
            @RequestParam String snapshot_title,
            @RequestParam String snapshot_id,
            @RequestParam String snapshot_author_id,
            @RequestParam String snapshot_tags,
            @RequestParam String snapshot_description
            ) {
        SnapshotModel snapshotModel = new SnapshotModel(
                Integer.parseInt(snapshot_views_count),
                Integer.parseInt(snapshot_likes_count),
                Integer.parseInt(snapshot_dislikes_count),
                Integer.parseInt(snapshot_comments_count),
                snapshot_timestamp,
                snapshot_title,
                snapshot_id,
                snapshot_author_id,
                snapshot_tags,
                snapshot_description);
        snapshotRepository.save(snapshotModel);
        Iterable<SnapshotModel> snapshots = snapshotRepository.findAll();
        model.put("snapshots", snapshots);
        return "main";
    }

}

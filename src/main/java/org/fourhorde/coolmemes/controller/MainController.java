package org.fourhorde.coolmemes.controller;

import org.fourhorde.coolmemes.model.SnapshotModel;
import org.fourhorde.coolmemes.repos.SnapshotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping
    public String add(
            Map<String, Object> model,
            @RequestParam String snapshot_timestamp,
            @RequestParam String snapshot_platform_id,
            @RequestParam String snapshot_post_id,
            @RequestParam String snapshot_type_id,
            @RequestParam String snapshot_views_count,
            @RequestParam String snapshot_likes_count,
            @RequestParam String snapshot_dislikes_count,
            @RequestParam String snapshot_re_count,
            @RequestParam String snapshot_comments_count,
            @RequestParam String snapshot_name,
            @RequestParam String snapshot_desc,
            @RequestParam String snapshot_link
            ) {
        SnapshotModel snapshotModel = new SnapshotModel(
                Integer.parseInt(snapshot_timestamp),
                Integer.parseInt(snapshot_platform_id),
                Integer.parseInt(snapshot_post_id),
                Integer.parseInt(snapshot_type_id),
                Integer.parseInt(snapshot_views_count),
                Integer.parseInt(snapshot_likes_count),
                Integer.parseInt(snapshot_dislikes_count),
                Integer.parseInt(snapshot_re_count),
                Integer.parseInt(snapshot_comments_count),
                snapshot_name,
                snapshot_desc,
                snapshot_link);
        snapshotRepository.save(snapshotModel);
        Iterable<SnapshotModel> snapshots = snapshotRepository.findAll();
        model.put("snapshots", snapshots);
        return "main";
    }

}

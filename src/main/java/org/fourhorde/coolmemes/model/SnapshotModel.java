package org.fourhorde.coolmemes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class SnapshotModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer snapshot_timestamp;
    private Integer snapshot_platform_id;
    private Integer snapshot_post_id;
    private Integer snapshot_type_id;
    private Integer snapshot_views_count;
    private Integer snapshot_likes_count;
    private Integer snapshot_dislikes_count;
    private Integer snapshot_re_count;
    private Integer snapshot_comments_count;

    private String snapshot_name;
    private String snapshot_desc;
    private String snapshot_link;

    public SnapshotModel() {}

    public SnapshotModel(int snapshot_timestamp, int snapshot_platform_id,
                         int snapshot_post_id, int snapshot_type_id,
                         int snapshot_views_count, int snapshot_likes_count,
                         int snapshot_dislikes_count, int snapshot_re_count,
                         int snapshot_comments_count, String snapshot_name,
                         String snapshot_desc, String snapshot_link) {
        this.snapshot_timestamp = snapshot_timestamp;
        this.snapshot_platform_id = snapshot_platform_id;
        this.snapshot_post_id = snapshot_post_id;
        this.snapshot_type_id = snapshot_type_id;
        this.snapshot_views_count = snapshot_views_count;
        this.snapshot_likes_count = snapshot_likes_count;
        this.snapshot_dislikes_count = snapshot_dislikes_count;
        this.snapshot_re_count = snapshot_re_count;
        this.snapshot_comments_count = snapshot_comments_count;
        this.snapshot_name = snapshot_name;
        this.snapshot_desc = snapshot_desc;
        this.snapshot_link = snapshot_link;
    }

    public Integer getId() {
        return id;
    }
    public Integer getSnapshot_timestamp(){
        return snapshot_timestamp;
    }
    public Integer getSnapshot_platform_id(){
        return snapshot_platform_id;
    }
    public Integer getSnapshot_post_id(){
        return snapshot_post_id;
    }
    public Integer getSnapshot_type_id(){
        return snapshot_type_id;
    }
    public Integer getSnapshot_views_count(){ return snapshot_views_count; }
    public Integer getSnapshot_likes_count(){
        return snapshot_likes_count;
    }
    public Integer getSnapshot_dislikes_count(){
        return snapshot_dislikes_count;
    }
    public Integer getSnapshot_re_count(){
        return snapshot_re_count;
    }
    public Integer getSnapshot_comments_count(){
        return snapshot_comments_count;
    }

    public String getSnapshot_name(){
        return snapshot_name;
    }
    public String getSnapshot_desc(){
        return snapshot_desc;
    }
    public String getSnapshot_link(){
        return snapshot_link;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setSnapshot_timestamp(Integer snapshot_timestamp){
        this.snapshot_timestamp = snapshot_timestamp;
    }
    public void setSnapshot_platform_id(Integer snapshot_platform_id){
        this.snapshot_platform_id = snapshot_platform_id;
    }
    public void setSnapshot_post_id(Integer snapshot_post_id){
        this.snapshot_post_id = snapshot_post_id;
    }
    public void setSnapshot_type_id(Integer snapshot_type_id){
        this.snapshot_type_id = snapshot_type_id;
    }
    public void setSnapshot_views_count(Integer snapshot_views_count){
        this.snapshot_views_count = snapshot_views_count;
    }
    public void setSnapshot_likes_count(Integer snapshot_likes_count){
        this.snapshot_likes_count = snapshot_likes_count;
    }
    public void setSnapshot_dislikes_count(Integer snapshot_dislikes_count) {
        this.snapshot_dislikes_count = snapshot_dislikes_count;
    }
    public void setSnapshot_re_count(Integer snapshot_re_count){
        this.snapshot_re_count = snapshot_re_count;
    }

    public void setSnapshot_comments_count(Integer snapshot_comments_count) {
        this.snapshot_comments_count = snapshot_comments_count;
    }
    public void setSnapshot_name(String snapshot_name){
        this.snapshot_name = snapshot_name;
    }
    public void setSnapshot_desc(String snapshot_desc){
        this.snapshot_desc = snapshot_desc;
    }

    public void setSnapshot_link(String snapshot_link){
        this.snapshot_link = snapshot_link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SnapshotModel)) return false;
        SnapshotModel that = (SnapshotModel) o;
        return snapshot_timestamp.equals(that.snapshot_timestamp) &&
                snapshot_platform_id.equals(that.snapshot_platform_id) &&
                snapshot_post_id.equals(that.snapshot_post_id) &&
                snapshot_type_id.equals(that.snapshot_type_id) &&
                snapshot_views_count.equals(that.snapshot_views_count) &&
                snapshot_likes_count.equals(that.snapshot_likes_count) &&
                snapshot_dislikes_count.equals(that.snapshot_dislikes_count) &&
                snapshot_re_count.equals(that.snapshot_re_count) &&
                snapshot_comments_count.equals(that.snapshot_comments_count) &&
                snapshot_name.equals(that.snapshot_name) &&
                Objects.equals(snapshot_desc, that.snapshot_desc) &&
                snapshot_link.equals(that.snapshot_link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshot_timestamp, snapshot_platform_id,
                snapshot_post_id, snapshot_type_id, snapshot_views_count,
                snapshot_likes_count, snapshot_dislikes_count, snapshot_re_count,
                snapshot_comments_count, snapshot_name, snapshot_desc, snapshot_link);
    }
}

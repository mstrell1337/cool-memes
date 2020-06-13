package org.fourhorde.coolmemes.model;

import com.opencsv.bean.CsvBindByName;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class SnapshotModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT")
    private Integer id;

    @CsvBindByName
    @Column(columnDefinition = "TEXT")
    private String snapshot_timestamp;
    @CsvBindByName
    @Column(columnDefinition = "BIGINT")
    private Integer snapshot_views_count;
    @CsvBindByName
    @Column(columnDefinition = "BIGINT")
    private Integer snapshot_likes_count;
    @CsvBindByName
    @Column(columnDefinition = "BIGINT")
    private Integer snapshot_dislikes_count;
    @CsvBindByName
    @Column(columnDefinition = "BIGINT")
    private Integer snapshot_comments_count;

    @CsvBindByName
    @Column(columnDefinition = "TEXT")
    private String snapshot_id;
    @CsvBindByName
    @Column(columnDefinition = "TEXT")
    private String snapshot_author_id;
    @CsvBindByName
    @Column(columnDefinition = "TEXT")
    private String snapshot_tags;
    @CsvBindByName
    @Column(columnDefinition = "TEXT")
    private String snapshot_title;
    @CsvBindByName
    @Column(columnDefinition = "TEXT")
    private String snapshot_description;

    public SnapshotModel() {}

    public SnapshotModel(
//            int snapshot_platform_id, int snapshot_post_id, int snapshot_type_id, int snapshot_re_count, String snapshot_link,
            int snapshot_views_count, int snapshot_likes_count,
            int snapshot_dislikes_count, int snapshot_comments_count,
            String snapshot_timestamp, String snapshot_title,
            String snapshot_id, String snapshot_author_id,
            String snapshot_tags, String snapshot_description) {
//        this.snapshot_platform_id = snapshot_platform_id;
//        this.snapshot_post_id = snapshot_post_id;
//        this.snapshot_type_id = snapshot_type_id;
//        this.snapshot_re_count = snapshot_re_count;
//        this.snapshot_link = snapshot_link;
        this.snapshot_timestamp = snapshot_timestamp;
        this.snapshot_views_count = snapshot_views_count;
        this.snapshot_likes_count = snapshot_likes_count;
        this.snapshot_dislikes_count = snapshot_dislikes_count;
        this.snapshot_comments_count = snapshot_comments_count;
        this.snapshot_title = snapshot_title;
        this.snapshot_description = snapshot_description;
        this.snapshot_id = snapshot_id;
        this.snapshot_author_id = snapshot_author_id;
        this.snapshot_tags= snapshot_tags;
    }

    public Integer getId() {
        return id;
    }
    public Integer getSnapshot_views_count(){ return snapshot_views_count; }
    public Integer getSnapshot_likes_count(){
        return snapshot_likes_count;
    }
    public Integer getSnapshot_dislikes_count(){
        return snapshot_dislikes_count;
    }
    public Integer getSnapshot_comments_count(){
        return snapshot_comments_count;
    }

    public String getSnapshot_timestamp(){
        return snapshot_timestamp;
    }
    public String getSnapshot_title(){
        return snapshot_title;
    }
    public String getSnapshot_description(){
        return snapshot_description;
    }
    public String getSnapshot_id() {
        return snapshot_id;
    }
    public String getSnapshot_author_id() {
        return snapshot_author_id;
    }
    public String getSnapshot_tags() {
        return snapshot_tags;
    }

    public void setId(Integer id) {
        this.id = id;
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
    public void setSnapshot_comments_count(Integer snapshot_comments_count) {
        this.snapshot_comments_count = snapshot_comments_count;
    }

    public void setSnapshot_timestamp(String snapshot_timestamp){
        this.snapshot_timestamp = snapshot_timestamp;
    }
    public void setSnapshot_title(String snapshot_name){
        this.snapshot_title = snapshot_name;
    }
    public void setSnapshot_description(String snapshot_desc){
        this.snapshot_description = snapshot_desc;
    }
    public void setSnapshot_id(String snapshot_id) {
        this.snapshot_id = snapshot_id;
    }
    public void setSnapshot_author_id(String snapshot_author_id) {
        this.snapshot_author_id = snapshot_author_id;
    }
    public void setSnapshot_tags(String snapshot_tags) {
        this.snapshot_tags = snapshot_tags;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SnapshotModel)) return false;
        SnapshotModel that = (SnapshotModel) o;
        return snapshot_timestamp.equals(that.snapshot_timestamp) &&
//                snapshot_platform_id.equals(that.snapshot_platform_id) &&
//                snapshot_post_id.equals(that.snapshot_post_id) &&
//                snapshot_type_id.equals(that.snapshot_type_id) &&
//                snapshot_re_count.equals(that.snapshot_re_count) &&
                snapshot_views_count.equals(that.snapshot_views_count) &&
                snapshot_likes_count.equals(that.snapshot_likes_count) &&
                snapshot_dislikes_count.equals(that.snapshot_dislikes_count) &&
                snapshot_comments_count.equals(that.snapshot_comments_count) &&
                snapshot_title.equals(that.snapshot_title) &&
                Objects.equals(snapshot_description, that.snapshot_description);
//                snapshot_link.equals(that.snapshot_link);
    }
    @Override
    public int hashCode() {
        return Objects.hash(snapshot_timestamp,
//                snapshot_platform_id, snapshot_post_id, snapshot_type_id,
//                snapshot_re_count, snapshot_link,
                snapshot_views_count, snapshot_likes_count, snapshot_dislikes_count,
                snapshot_comments_count, snapshot_title, snapshot_description);
    }

//    @CsvBindByName
//    private String snapshot_link;
//    @CsvBindByName
//    private Integer snapshot_re_count;
//    @CsvBindByName
//    private Integer snapshot_platform_id;
//    @CsvBindByName
//    private Integer snapshot_post_id;
//    @CsvBindByName
//    private Integer snapshot_type_id;
//    public void setSnapshot_link(String snapshot_link){
//        this.snapshot_link = snapshot_link;
//    }
//    public String getSnapshot_link(){
//        return snapshot_link;
//    }
//    public void setSnapshot_re_count(Integer snapshot_re_count){
//        this.snapshot_re_count = snapshot_re_count;
//    }
//    public void setSnapshot_re_count(Integer snapshot_re_count){
//        this.snapshot_re_count = snapshot_re_count;
//    }
//    public void setSnapshot_re_count(Integer snapshot_re_count){
//        this.snapshot_re_count = snapshot_re_count;
//    }
//    public void setSnapshot_re_count(Integer snapshot_re_count){
//        this.snapshot_re_count = snapshot_re_count;
//    }
//    public void setSnapshot_re_count(Integer snapshot_re_count){
//        this.snapshot_re_count = snapshot_re_count;
//    }
//    public void setSnapshot_platform_id(Integer snapshot_platform_id){
//        this.snapshot_platform_id = snapshot_platform_id;
//    }
//    public void setSnapshot_post_id(Integer snapshot_post_id){
//        this.snapshot_post_id = snapshot_post_id;
//    }
//    public void setSnapshot_type_id(Integer snapshot_type_id){
//        this.snapshot_type_id = snapshot_type_id;
//    }
//    public Integer getSnapshot_re_count(){
//        return snapshot_re_count;
//    }
//    public Integer getSnapshot_platform_id(){
//        return snapshot_platform_id;
//    }
//    public Integer getSnapshot_post_id(){
//        return snapshot_post_id;
//    }
//    public Integer getSnapshot_type_id(){
//        return snapshot_type_id;
//    }
}

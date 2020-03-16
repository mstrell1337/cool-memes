package org.fourhorde.coolmemes;
import java.lang.reflect.Constructor;
import java.util.Objects;


public class SnapshotsModel {
    private int  snapshot_timestamp;
    private int snapshot_platform_id;
    private int snapshot_post_id;
    private int snapshot_type_id;
    private int snapshot_views_count;
    private int snapshot_likes_count;
    private int snapshot_dislikes_count;
    private int snapshot_re_count;
    private int snapshot_comments_count;

    private String snapshot_name;
    private String snapshot_desc;
    private String snapshot_link;

    public SnapshotsModel(int snapshot_timestamp, int snapshot_platform_id,
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

    public int getSnapshot_timestamp(){
        return snapshot_timestamp;
    }
    public int getSnapshot_platform_id(){
        return snapshot_platform_id;
    }
    public int getSnapshot_post_id(){
        return snapshot_post_id;
    }
    public int getSnapshot_type_id(){
        return snapshot_type_id;
    }
    public int getSnapshot_views_count(){ return snapshot_views_count; }
    public int getSnapshot_likes_count(){
        return snapshot_likes_count;
    }
    public int getSnapshot_dislikes_count(){
        return snapshot_dislikes_count;
    }
    public int getSnapshot_re_count(){
        return snapshot_re_count;
    }
    public int getSnapshot_comments_count(){
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

    public void setSnapshot_timestamp(int snapshot_timestamp){
        this.snapshot_timestamp = snapshot_timestamp;
    }
    public void setSnapshot_platform_id(int snapshot_platform_id){
        this.snapshot_platform_id = snapshot_platform_id;
    }
    public void setSnapshot_post_id(int snapshot_post_id){
        this.snapshot_post_id = snapshot_post_id;
    }
    public void setSnapshot_type_id(int snapshot_type_id){
        this.snapshot_type_id = snapshot_type_id;
    }
    public void setSnapshot_views_count(int snapshot_views_count){
        this.snapshot_views_count = snapshot_views_count;
    }
    public void setSnapshot_likes_count(int snapshot_likes_count){
        this.snapshot_likes_count = snapshot_likes_count;
    }
    public void setSnapshot_dislikes_count(int snapshot_dislikes_count) {
        this.snapshot_dislikes_count = snapshot_dislikes_count;
    }
    public void setSnapshot_re_count(int snapshot_re_count){
        this.snapshot_re_count = snapshot_re_count;
    }
    public void setSnapshot_comments_count(int snapshot_comments_count) {
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
        if (!(o instanceof SnapshotsModel)) return false;
        SnapshotsModel that = (SnapshotsModel) o;
        return snapshot_timestamp == that.snapshot_timestamp &&
                snapshot_platform_id == that.snapshot_platform_id &&
                snapshot_post_id == that.snapshot_post_id &&
                snapshot_type_id == that.snapshot_type_id &&
                snapshot_views_count == that.snapshot_views_count &&
                snapshot_likes_count == that.snapshot_likes_count &&
                snapshot_dislikes_count == that.snapshot_dislikes_count &&
                snapshot_re_count == that.snapshot_re_count &&
                snapshot_comments_count == that.snapshot_comments_count &&
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

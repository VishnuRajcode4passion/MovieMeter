package com.example.machine2.moviemeter;

import java.util.List;

/**
 * Created by machine2 on 11/05/16.
 */
public class MovieDetailResponse {


    /**
     * adult : false
     * backdrop_path : /6bbZ6XyvgfjhQwbplnUh1LSj1ky.jpg
     * belongs_to_collection : null
     * budget : 3300000
     * genres : [{"id":18,"name":"Drama"},{"id":10402,"name":"Music"}]
     * homepage :
     * id : 244786
     * imdb_id : tt2582802
     * original_language : en
     * original_title : Whiplash
     * overview : Under the direction of a ruthless instructor, a talented young drummer begins to pursue perfection at any cost, even his humanity.
     * popularity : 5.941271
     * poster_path : /lIv1QinFqz4dlp5U4lQ6HaiskOZ.jpg
     * production_companies : [{"name":"Bold Films","id":2266},{"name":"Blumhouse Productions","id":3172},{"name":"Right of Way Films","id":32157}]
     * production_countries : [{"iso_3166_1":"US","name":"United States of America"}]
     * release_date : 2014-10-10
     * revenue : 13993092
     * runtime : 105
     * spoken_languages : [{"iso_639_1":"en","name":"English"}]
     * status : Released
     * tagline : The road to greatness can take you to the edge.
     * title : Whiplash
     * video : false
     * vote_average : 8.4
     * vote_count : 1831
     * videos : {"results":[{"id":"543d8f250e0a266f7d00059f","iso_639_1":"en","iso_3166_1":"US","key":"7d_jQycdQGo","name":"Whiplash trailer","site":"YouTube","size":360,"type":"Trailer"},{"id":"54e013519251411956004b09","iso_639_1":"en","iso_3166_1":"US","key":"fHAfUSBc0pg","name":"TV Promo","site":"YouTube","size":720,"type":"Trailer"}]}
     */

    private boolean adult;
    private String backdrop_path;
    private Object belongs_to_collection;
    private int budget;
    private String homepage;
    private int id;
    private String imdb_id;
    private String original_language;
    private String original_title;
    private String overview;
    private double popularity;
    private String poster_path;
    private String release_date;
    private int revenue;
    private int runtime;
    private String status;
    private String tagline;
    private String title;
    private boolean video;
    private double vote_average;
    private int vote_count;
    private VideosBean videos;
    /**
     * id : 18
     * name : Drama
     */

    private List<GenresBean> genres;
    /**
     * name : Bold Films
     * id : 2266
     */

    private List<ProductionCompaniesBean> production_companies;
    /**
     * iso_3166_1 : US
     * name : United States of America
     */

    private List<ProductionCountriesBean> production_countries;
    /**
     * iso_639_1 : en
     * name : English
     */

    private List<SpokenLanguagesBean> spoken_languages;

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public Object getBelongs_to_collection() {
        return belongs_to_collection;
    }

    public void setBelongs_to_collection(Object belongs_to_collection) {
        this.belongs_to_collection = belongs_to_collection;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public VideosBean getVideos() {
        return videos;
    }

    public void setVideos(VideosBean videos) {
        this.videos = videos;
    }

    public List<GenresBean> getGenres() {
        return genres;
    }

    public void setGenres(List<GenresBean> genres) {
        this.genres = genres;
    }

    public List<ProductionCompaniesBean> getProduction_companies() {
        return production_companies;
    }

    public void setProduction_companies(List<ProductionCompaniesBean> production_companies) {
        this.production_companies = production_companies;
    }

    public List<ProductionCountriesBean> getProduction_countries() {
        return production_countries;
    }

    public void setProduction_countries(List<ProductionCountriesBean> production_countries) {
        this.production_countries = production_countries;
    }

    public List<SpokenLanguagesBean> getSpoken_languages() {
        return spoken_languages;
    }

    public void setSpoken_languages(List<SpokenLanguagesBean> spoken_languages) {
        this.spoken_languages = spoken_languages;
    }

    public static class VideosBean {
        /**
         * id : 543d8f250e0a266f7d00059f
         * iso_639_1 : en
         * iso_3166_1 : US
         * key : 7d_jQycdQGo
         * name : Whiplash trailer
         * site : YouTube
         * size : 360
         * type : Trailer
         */

        private List<ResultsBean> results;

        public List<ResultsBean> getResults() {
            return results;
        }

        public void setResults(List<ResultsBean> results) {
            this.results = results;
        }

        public static class ResultsBean {
            private String id;
            private String iso_639_1;
            private String iso_3166_1;
            private String key;
            private String name;
            private String site;
            private int size;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIso_639_1() {
                return iso_639_1;
            }

            public void setIso_639_1(String iso_639_1) {
                this.iso_639_1 = iso_639_1;
            }

            public String getIso_3166_1() {
                return iso_3166_1;
            }

            public void setIso_3166_1(String iso_3166_1) {
                this.iso_3166_1 = iso_3166_1;
            }

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getSite() {
                return site;
            }

            public void setSite(String site) {
                this.site = site;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }

    public static class GenresBean {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ProductionCompaniesBean {
        private String name;
        private int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static class ProductionCountriesBean {
        private String iso_3166_1;
        private String name;

        public String getIso_3166_1() {
            return iso_3166_1;
        }

        public void setIso_3166_1(String iso_3166_1) {
            this.iso_3166_1 = iso_3166_1;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class SpokenLanguagesBean {
        private String iso_639_1;
        private String name;

        public String getIso_639_1() {
            return iso_639_1;
        }

        public void setIso_639_1(String iso_639_1) {
            this.iso_639_1 = iso_639_1;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

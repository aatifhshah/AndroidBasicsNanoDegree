package com.example.laviathor.tourguideapp;

/**
 * Created by LAViATHoR on 7/2/2016.
 */
public class Region {

    private int regionNameID;
    private int regionRatingID;
    private int regionImageID;


    /**
     * Constructor
     * @Param name: Region Name
     * @Param description: Region Description
     * @Param image: Region Image Resource ID
     */
    public Region(int name, int rating, int imageID){
        this.regionNameID = name;
        this.regionRatingID = rating;
        this.regionImageID = imageID;
    }

    /**
     * Gets the Region Name
     */
    public int getRegionName(){return regionNameID;}

    /**
     * Gets the Description
     */
    public int getRegionRating(){return regionRatingID;}

    /**
     * Gets the Region Image resource id
     */
    public int getRegionImage(){return regionImageID;}



}



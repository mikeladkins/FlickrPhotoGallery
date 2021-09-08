package com.madkins.photogallery.api

import com.google.gson.annotations.SerializedName
import com.madkins.photogallery.GalleryItem

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}
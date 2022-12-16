package dgtic.unam.practica12.model

import com.google.gson.annotations.SerializedName
data class ModeloDog(
    @SerializedName("message") var images:List<String>)
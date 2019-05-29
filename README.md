# workshopkotlin

Configurações gradle

    implementation 'com.squareup.retrofit2:retrofit:2.1.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.1.0'
    implementation 'com.squareup.okhttp3:okhttp:3.5.0'
    implementation 'com.squareup.okhttp3:logging-interceptor:3.5.0'

    // componente para fazer o download da imagem
    implementation 'com.github.bumptech.glide:glide:4.4.0'
    
    
    
    
    
    
import com.example.dirceu.aularetrofit.app.AulaRetrofitApp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitInitializer {

    companion object {
        private val okHttpClient: OkHttpClient by lazy {
            OkHttpClient.Builder()
                    // habilitando impressão das requisições no logcat
                .addInterceptor(HttpLoggingInterceptor().also { it -> it.level = HttpLoggingInterceptor.Level.BODY })
                    // configurando timeout das requisições
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .build()
        }

    }


    private val retrofit = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(AulaRetrofitApp.URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun serviceTime(): ServiceTime {
        return retrofit.create(ServiceTime::class.java)
    }

}

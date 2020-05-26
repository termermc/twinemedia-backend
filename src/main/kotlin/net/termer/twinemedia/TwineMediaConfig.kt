package net.termer.twinemedia

/**
 * TwineMedia configuration class
 * @since 1.0
 */
class TwineMediaConfig {
    var domain = "default"

    var upload_location = "file-uploads/"
    var max_upload = 1073741824

    var db_address = "localhost"
    var db_port = 5432
    var db_name = "twinemedia"
    var db_user = "me"
    var db_pass = "drowssap"
    var db_max_pool_size = 5
    var db_auto_migrate = true

    var jwt_secret = "jwtauth_please_change_me"
    var jwt_expire_minutes = 120

    var crypt_processor_count = 1
    var crypt_memory_kb = 2048

    var frontend_host = "*"
    var reverse_proxy = false

    var ffmpeg_path = "/usr/bin/ffmpeg"
    var ffprobe_path = "/usr/bin/ffprobe"

    var media_processor_count = 2

    var max_auth_attempts = 5
    var auth_timeout_period = 12000
}
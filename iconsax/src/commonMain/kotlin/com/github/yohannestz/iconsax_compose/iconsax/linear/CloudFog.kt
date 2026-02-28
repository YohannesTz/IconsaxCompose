package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudFog: ImageVector
    get() {
        val current = _cloudFog
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudFog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.29f, y = 11.62f)
                curveTo(x1 = 1.09f, y1 = 2.69f, x2 = 14.62f, y2 = -0.87f, x3 = 16.17f, y3 = 8.5f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.03f, dy1 = 3.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.54f, y = 8.93f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.67f, dy1 = -0.41f)
                moveTo(x = 4.0f, y = 15.03f)
                horizontalLineToRelative(dx = 16.0f)
                moveToRelative(dx = -14.0f, dy = 3.0f)
                horizontalLineToRelative(dx = 12.0f)
                moveToRelative(dx = -9.0f, dy = 3.0f)
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _cloudFog = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudFog: ImageVector? = null

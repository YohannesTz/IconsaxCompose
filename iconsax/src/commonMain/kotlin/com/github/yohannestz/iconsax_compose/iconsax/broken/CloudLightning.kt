package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudLightning: ImageVector
    get() {
        val current = _cloudLightning
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudLightning",
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
                moveTo(x = 9.23f, y = 19.16f)
                horizontalLineToRelative(dx = 1.0f)
                verticalLineToRelative(dy = 2.33f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.34f, dx2 = 0.43f, dy2 = 0.51f, dx3 = 0.65f, dy3 = 0.25f)
                lineToRelative(dx = 2.45f, dy = -2.79f)
                curveToRelative(dx1 = 0.3f, dy1 = -0.34f, dx2 = 0.17f, dy2 = -0.62f, dx3 = -0.28f, dy3 = -0.62f)
                horizontalLineToRelative(dx = -1.0f)
                verticalLineTo(y = 16.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.34f, dx2 = -0.43f, dy2 = -0.5f, dx3 = -0.65f, dy3 = -0.25f)
                lineToRelative(dx = -2.45f, dy = 2.8f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.33f, dx2 = -0.17f, dy2 = 0.61f, dx3 = 0.28f, dy3 = 0.61f)
                moveTo(x = 12.0f, y = 3.98f)
                curveToRelative(dx1 = -4.0f, dy1 = -0.34f, dx2 = -8.34f, dy2 = 3.11f, dx3 = -6.38f, dy3 = 8.58f)
                moveTo(x = 16.6f, y = 20.0f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.62f, dy1 = -1.39f)
                curveToRelative(dx1 = 3.27f, dy1 = -2.86f, dx2 = 1.52f, dy2 = -8.6f, dx3 = -2.79f, dy3 = -9.14f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.48f, dy1 = -3.45f)
                moveToRelative(dx = -8.68f, dy = 6.95f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.71f, dy1 = -0.4f)
                curveToRelative(dx1 = -4.66f, dy1 = 0.33f, dx2 = -4.65f, dy2 = 7.11f, dx3 = 0.0f, dy3 = 7.44f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.82f, y = 9.89f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.66f, dy1 = -0.41f)
            }
        }.build().also { _cloudLightning = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudLightning: ImageVector? = null

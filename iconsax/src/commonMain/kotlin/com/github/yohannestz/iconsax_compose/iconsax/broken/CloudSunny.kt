package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudSunny: ImageVector
    get() {
        val current = _cloudSunny
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudSunny",
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
                moveTo(x = 7.26f, y = 5.43f)
                curveToRelative(dx1 = 2.48f, dy1 = -2.01f, dx2 = 6.5f, dy2 = -2.11f, dx3 = 8.74f, dy3 = 0.6f)
                verticalLineToRelative(dy = 0.0f)
                curveToRelative(dx1 = 0.7f, dy1 = 0.87f, dx2 = 1.23f, dy2 = 2.0f, dx3 = 1.47f, dy3 = 3.46f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.18f, dy1 = 1.74f)
                curveToRelative(dx1 = 1.75f, dy1 = 2.07f, dx2 = 1.9f, dy2 = 5.45f, dx3 = -0.38f, dy3 = 7.45f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.64f, dy1 = 1.4f)
                horizontalLineTo(x = 5.54f)
                curveToRelative(dx1 = -4.67f, dy1 = -0.34f, dx2 = -4.68f, dy2 = -7.14f, dx3 = 0.0f, dy3 = -7.48f)
                horizontalLineTo(x = 5.6f)
                arcToRelative(a = 7.3f, b = 7.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.4f, dy1 = -3.64f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.26f, y = 13.01f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.67f, dy1 = -0.4f)
                moveToRelative(dx = 10.26f, dy = -2.69f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.67f, dy1 = -0.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.97f, y = 8.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.1f, dx2 = -0.51f, dy2 = 2.09f, dx3 = -1.32f, dy3 = 2.73f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.18f, dy1 = -1.74f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 6.04f)
                verticalLineTo(y = 6.03f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.47f, y1 = 5.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.5f, dy1 = 3.5f)
            }
        }.build().also { _cloudSunny = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudSunny: ImageVector? = null

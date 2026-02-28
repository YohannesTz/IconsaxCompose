package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoPlay: ImageVector
    get() {
        val current = _videoPlay
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoPlay",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 2.32f, dx3 = 7.75f, dy3 = 7.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.61f, dx2 = -1.64f, dy2 = -6.25f, dx3 = -6.25f, dy3 = -6.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.48f, y = 7.86f)
                horizontalLineTo(x = 2.52f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 18.96f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.52f, y = 7.72f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.11f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.27f, y1 = 1.7f, x2 = 9.27f, y2 = 2.11f)
                verticalLineToRelative(dy = 4.86f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = 6.96f, dy = -0.45f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.11f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 4.41f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -4.39f, dy = 10.85f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = -0.26f)
                curveTo(x1 = 9.4f, y1 = 17.46f, x2 = 9.0f, y2 = 16.66f, x3 = 9.0f, y3 = 15.66f)
                verticalLineToRelative(dy = -2.4f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.02f, dx2 = 0.4f, dy2 = -1.83f, dx3 = 1.09f, dy3 = -2.23f)
                reflectiveCurveToRelative(dx1 = 1.59f, dy1 = -0.34f, dx2 = 2.46f, dy2 = 0.17f)
                lineToRelative(dx = 2.08f, dy = 1.2f)
                curveToRelative(dx1 = 0.87f, dy1 = 0.5f, dx2 = 1.38f, dy2 = 1.25f, dx3 = 1.38f, dy3 = 2.05f)
                reflectiveCurveTo(x1 = 15.5f, y1 = 16.0f, x2 = 14.62f, y2 = 16.5f)
                lineToRelative(dx = -2.08f, dy = 1.2f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.45f, dy1 = 0.42f)
                moveToRelative(dx = 0.01f, dy = -5.85f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.26f, dy1 = 0.06f)
                curveToRelative(dx1 = -0.21f, dy1 = 0.12f, dx2 = -0.34f, dy2 = 0.46f, dx3 = -0.34f, dy3 = 0.92f)
                verticalLineToRelative(dy = 2.4f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.45f, dx2 = 0.13f, dy2 = 0.8f, dx3 = 0.34f, dy3 = 0.92f)
                reflectiveCurveToRelative(dx1 = 0.57f, dy1 = 0.06f, dx2 = 0.96f, dy2 = -0.17f)
                lineToRelative(dx = 2.08f, dy = -1.2f)
                curveToRelative(dx1 = 0.39f, dy1 = -0.23f, dx2 = 0.63f, dy2 = -0.5f, dx3 = 0.63f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.23f, dy1 = -0.52f, dx2 = -0.63f, dy2 = -0.75f)
                lineToRelative(dx = -2.08f, dy = -1.2f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = -0.23f)
            }
        }.build().also { _videoPlay = it }
    }

@Suppress("ObjectPropertyName")
private var _videoPlay: ImageVector? = null

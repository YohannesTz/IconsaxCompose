package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 14.73f, y = 2.0f)
                horizontalLineTo(x = 9.27f)
                verticalLineToRelative(dy = 4.36f)
                horizontalLineToRelative(dx = 5.46f)
                close()
                moveToRelative(dx = 1.5f, dy = 0.0f)
                verticalLineToRelative(dy = 4.36f)
                horizontalLineToRelative(dx = 5.64f)
                curveTo(x1 = 21.36f, y1 = 3.61f, x2 = 19.33f, y2 = 2.01f, x3 = 16.23f, y3 = 2.0f)
                moveTo(x = 2.0f, y = 7.86f)
                verticalLineToRelative(dy = 8.33f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.38f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.86f)
                close()
                moveToRelative(dx = 12.44f, dy = 8.32f)
                lineToRelative(dx = -2.08f, dy = 1.2f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.27f, dy1 = 0.38f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.82f, dy1 = -0.21f)
                curveToRelative(dx1 = -0.58f, dy1 = -0.33f, dx2 = -0.9f, dy2 = -1.01f, dx3 = -0.9f, dy3 = -1.89f)
                verticalLineToRelative(dy = -2.4f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.88f, dx2 = 0.32f, dy2 = -1.56f, dx3 = 0.9f, dy3 = -1.89f)
                curveToRelative(dx1 = 0.58f, dy1 = -0.34f, dx2 = 1.32f, dy2 = -0.28f, dx3 = 2.09f, dy3 = 0.17f)
                lineToRelative(dx = 2.08f, dy = 1.2f)
                curveToRelative(dx1 = 0.77f, dy1 = 0.44f, dx2 = 1.19f, dy2 = 1.06f, dx3 = 1.19f, dy3 = 1.73f)
                reflectiveCurveToRelative(dx1 = -0.43f, dy1 = 1.26f, dx2 = -1.19f, dy2 = 1.71f)
                moveTo(x = 7.77f, y = 2.0f)
                curveToRelative(dx1 = -3.1f, dy1 = 0.01f, dx2 = -5.13f, dy2 = 1.61f, dx3 = -5.64f, dy3 = 4.36f)
                horizontalLineToRelative(dx = 5.64f)
                close()
            }
        }.build().also { _videoPlay = it }
    }

@Suppress("ObjectPropertyName")
private var _videoPlay: ImageVector? = null

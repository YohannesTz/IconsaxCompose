package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Video: ImageVector
    get() {
        val current = _video
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Video",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 13.0f, y = 3.25f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 3.58f, y1 = 3.25f, x2 = 2.25f, y2 = 4.58f, x3 = 2.25f, y3 = 8.0f)
                verticalLineToRelative(dy = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.3f, dx2 = 1.25f, dy2 = 4.75f, dx3 = 4.75f, dy3 = 4.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 3.42f, dy1 = 0.0f, dx2 = 4.75f, dy2 = -1.33f, dx3 = 4.75f, dy3 = -4.75f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.42f, dx2 = -1.33f, dy2 = -4.75f, dx3 = -4.75f, dy3 = -4.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.5f, y = 11.38f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.76f)
                arcToRelative(a = 1.88f, b = 1.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.76f)
                moveToRelative(dx = 10.15f, dy = -5.2f)
                curveToRelative(dx1 = -0.41f, dy1 = -0.22f, dx2 = -1.27f, dy2 = -0.46f, dx3 = -2.44f, dy3 = 0.36f)
                lineToRelative(dx = -1.48f, dy = 1.04f)
                lineTo(x = 17.75f, y = 8.0f)
                verticalLineToRelative(dy = 8.0f)
                lineToRelative(dx = -0.02f, dy = 0.42f)
                lineToRelative(dx = 1.48f, dy = 1.04f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.59f, dy1 = 0.58f)
                curveToRelative(dx1 = 0.37f, dy1 = 0.0f, dx2 = 0.66f, dy2 = -0.1f, dx3 = 0.85f, dy3 = -0.2f)
                curveToRelative(dx1 = 0.41f, dy1 = -0.2f, dx2 = 1.1f, dy2 = -0.78f, dx3 = 1.1f, dy3 = -2.2f)
                verticalLineTo(y = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.43f, dx2 = -0.69f, dy2 = -2.0f, dx3 = -1.1f, dy3 = -2.2f)
            }
        }.build().also { _video = it }
    }

@Suppress("ObjectPropertyName")
private var _video: ImageVector? = null

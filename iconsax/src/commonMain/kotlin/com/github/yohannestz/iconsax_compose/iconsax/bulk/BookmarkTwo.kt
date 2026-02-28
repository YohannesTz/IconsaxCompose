package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookmarkTwo: ImageVector
    get() {
        val current = _bookmarkTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BookmarkTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 4.96f)
                verticalLineToRelative(dy = 7.12f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.99f, dx2 = -1.41f, dy2 = 2.76f, dx3 = -3.14f, dy3 = 1.72f)
                lineTo(x = 12.54f, y = 13.0f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.08f, dy1 = 0.0f)
                lineToRelative(dx = -1.32f, dy = 0.8f)
                curveTo(x1 = 8.41f, y1 = 14.84f, x2 = 7.0f, y2 = 14.07f, x3 = 7.0f, y3 = 12.08f)
                verticalLineTo(y = 4.99f)
                quadTo(x1 = 7.02f, y1 = 2.0f, x2 = 10.0f, y2 = 2.0f)
                horizontalLineToRelative(dx = 4.0f)
                quadToRelative(dx1 = 2.97f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 2.96f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 11.9f)
                verticalLineToRelative(dy = 3.03f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.05f, dx2 = -2.0f, dy2 = 7.07f, dx3 = -7.0f, dy3 = 7.07f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -7.0f, dy2 = -2.02f, dx3 = -7.0f, dy3 = -7.07f)
                verticalLineTo(y = 11.9f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.24f, dx2 = 1.41f, dy2 = -6.34f, dx3 = 4.82f, dy3 = -6.91f)
                horizontalLineTo(x = 7.0f)
                verticalLineToRelative(dy = 7.09f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.99f, dx2 = 1.41f, dy2 = 2.76f, dx3 = 3.14f, dy3 = 1.72f)
                lineToRelative(dx = 1.32f, dy = -0.8f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.08f, dy1 = 0.0f)
                lineToRelative(dx = 1.32f, dy = 0.8f)
                curveToRelative(dx1 = 1.73f, dy1 = 1.04f, dx2 = 3.14f, dy2 = 0.27f, dx3 = 3.14f, dy3 = -1.72f)
                verticalLineTo(y = 4.96f)
                curveToRelative(dx1 = 3.54f, dy1 = 0.52f, dx2 = 5.0f, dy2 = 2.63f, dx3 = 5.0f, dy3 = 6.94f)
            }
        }.build().also { _bookmarkTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _bookmarkTwo: ImageVector? = null

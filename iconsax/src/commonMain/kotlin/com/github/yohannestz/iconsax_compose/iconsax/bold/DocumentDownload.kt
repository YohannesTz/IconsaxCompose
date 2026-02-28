package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentDownload: ImageVector
    get() {
        val current = _documentDownload
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DocumentDownload",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.5f, y = 10.19f)
                horizontalLineToRelative(dx = -2.89f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.3f, dy1 = -4.3f)
                verticalLineTo(y = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
                horizontalLineTo(x = 8.07f)
                curveTo(x1 = 4.99f, y1 = 2.0f, x2 = 2.5f, y2 = 4.0f, x3 = 2.5f, y3 = 7.57f)
                verticalLineToRelative(dy = 8.86f)
                curveTo(x1 = 2.5f, y1 = 20.0f, x2 = 4.99f, y2 = 22.0f, x3 = 8.07f, y3 = 22.0f)
                horizontalLineToRelative(dx = 7.86f)
                curveToRelative(dx1 = 3.08f, dy1 = 0.0f, dx2 = 5.57f, dy2 = -2.0f, dx3 = 5.57f, dy3 = -5.57f)
                verticalLineToRelative(dy = -5.24f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
                moveToRelative(dx = -8.22f, dy = 5.59f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.25f, dy1 = 0.16f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.56f, dy1 = 0.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.22f, dy1 = -0.15f)
                lineToRelative(dx = -0.02f, dy = -0.02f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineTo(x = 9.0f, y = 15.44f)
                verticalLineToRelative(dy = -4.19f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 4.19f)
                lineToRelative(dx = 0.72f, dy = -0.72f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.43f, y = 8.81f)
                lineToRelative(dx = 3.4f, dy = 0.01f)
                curveToRelative(dx1 = 0.57f, dy1 = 0.0f, dx2 = 0.87f, dy2 = -0.67f, dx3 = 0.47f, dy3 = -1.07f)
                lineToRelative(dx = -5.5f, dy = -5.54f)
                curveToRelative(dx1 = -0.41f, dy1 = -0.41f, dx2 = -1.12f, dy2 = -0.13f, dx3 = -1.12f, dy3 = 0.44f)
                verticalLineToRelative(dy = 3.49f)
                arcToRelative(a = 2.73f, b = 2.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.75f, dy1 = 2.67f)
            }
        }.build().also { _documentDownload = it }
    }

@Suppress("ObjectPropertyName")
private var _documentDownload: ImageVector? = null

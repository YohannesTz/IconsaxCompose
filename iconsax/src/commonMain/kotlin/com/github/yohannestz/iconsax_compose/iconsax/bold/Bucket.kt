package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bucket: ImageVector
    get() {
        val current = _bucket
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bucket",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.04f, y = 10.64f)
                lineTo(x = 9.69f, y = 3.29f)
                lineTo(x = 8.82f, y = 2.42f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = 0.87f, dy = 0.87f)
                lineTo(x = 3.0f, y = 9.98f)
                quadToRelative(dx1 = -0.96f, dy1 = 0.96f, dx2 = -1.0f, dy2 = 1.94f)
                quadToRelative(dx1 = -0.03f, dy1 = 1.04f, dx2 = 1.0f, dy2 = 2.07f)
                lineTo(x = 7.01f, y = 18.0f)
                quadToRelative(dx1 = 2.01f, dy1 = 2.0f, dx2 = 4.01f, dy2 = 0.0f)
                lineToRelative(dx = 6.02f, dy = -6.02f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.27f, dy1 = -0.73f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.27f, dy1 = -0.61f)
                moveTo(x = 16.0f, y = 22.75f)
                horizontalLineTo(x = 3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.59f, y1 = 21.25f, x2 = 3.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 13.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 3.35f, dy = -7.97f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 0.0f)
                curveToRelative(dx1 = -0.31f, dy1 = 0.34f, dx2 = -1.85f, dy2 = 2.07f, dx3 = -1.85f, dy3 = 3.39f)
                arcToRelative(a = 2.35f, b = 2.35f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 4.7f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.31f, dx2 = -1.54f, dy2 = -3.05f, dx3 = -1.85f, dy3 = -3.39f)
            }
        }.build().also { _bucket = it }
    }

@Suppress("ObjectPropertyName")
private var _bucket: ImageVector? = null

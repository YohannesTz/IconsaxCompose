package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MapOne: ImageVector
    get() {
        val current = _mapOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MapOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.29f, y = 7.78f)
                verticalLineToRelative(dy = 9.73f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.9f, dx2 = 1.35f, dy2 = 2.68f, dx3 = 2.99f, dy3 = 1.74f)
                lineToRelative(dx = 2.35f, dy = -1.34f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.89f, dy1 = -0.05f)
                lineToRelative(dx = 5.25f, dy = 2.63f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.89f, dy1 = -0.05f)
                lineToRelative(dx = 4.33f, dy = -2.48f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 16.22f)
                verticalLineTo(y = 6.49f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.9f, dx2 = -1.35f, dy2 = -2.68f, dx3 = -2.99f, dy3 = -1.74f)
                lineToRelative(dx = -2.35f, dy = 1.34f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.89f, dy1 = 0.05f)
                lineTo(x = 9.52f, y = 3.52f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.89f, dy1 = 0.05f)
                lineTo(x = 3.3f, y = 6.05f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.01f, dy1 = 1.73f)
                moveTo(x = 8.56f, y = 4.0f)
                verticalLineToRelative(dy = 13.0f)
                moveToRelative(dx = 7.17f, dy = -10.38f)
                verticalLineTo(y = 20.0f)
            }
        }.build().also { _mapOne = it }
    }

@Suppress("ObjectPropertyName")
private var _mapOne: ImageVector? = null

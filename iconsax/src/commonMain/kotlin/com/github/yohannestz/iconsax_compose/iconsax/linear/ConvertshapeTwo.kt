package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConvertshapeTwo: ImageVector
    get() {
        val current = _convertshapeTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ConvertshapeTwo",
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
                moveTo(x = 11.0f, y = 16.15f)
                verticalLineToRelative(dy = 2.7f)
                curveTo(x1 = 11.0f, y1 = 21.1f, x2 = 10.1f, y2 = 22.0f, x3 = 7.85f, y3 = 22.0f)
                horizontalLineToRelative(dx = -2.7f)
                curveTo(x1 = 2.9f, y1 = 22.0f, x2 = 2.0f, y2 = 21.1f, x3 = 2.0f, y3 = 18.85f)
                verticalLineToRelative(dy = -2.7f)
                curveTo(x1 = 2.0f, y1 = 13.9f, x2 = 2.9f, y2 = 13.0f, x3 = 5.15f, y3 = 13.0f)
                horizontalLineToRelative(dx = 2.7f)
                curveTo(x1 = 10.1f, y1 = 13.0f, x2 = 11.0f, y2 = 13.9f, x3 = 11.0f, y3 = 16.15f)
                moveTo(x = 22.0f, y = 15.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.0f, dy1 = 7.0f)
                lineToRelative(dx = 1.05f, dy = -1.75f)
                moveTo(x = 2.0f, y = 9.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = -7.0f)
                lineTo(x = 7.95f, y = 3.75f)
                moveTo(x = 17.5f, y = 11.0f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -9.0f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 9.0f)
            }
        }.build().also { _convertshapeTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _convertshapeTwo: ImageVector? = null

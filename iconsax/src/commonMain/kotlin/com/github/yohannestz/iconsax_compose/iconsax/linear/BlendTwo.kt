package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BlendTwo: ImageVector
    get() {
        val current = _blendTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BlendTwo",
            defaultWidth = 22.0.dp,
            defaultHeight = 22.0.dp,
            viewportWidth = 22.0f,
            viewportHeight = 22.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.97f, y = 8.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.93f, dy1 = 6.93f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 0.97f, y1 = 8.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 14.0f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.97f, y = 14.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -13.93f, dy1 = 0.93f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.86f, dy1 = -7.86f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.97f, y1 = 14.0f)
                moveToRelative(dx = -7.85f, dy = -0.88f)
                lineToRelative(dx = 1.31f, dy = 1.29f)
                moveTo(x = 15.97f, y = 11.0f)
                lineToRelative(dx = -1.0f, dy = -1.0f)
                moveToRelative(dx = -4.0f, dy = 6.0f)
                lineToRelative(dx = -1.0f, dy = -1.0f)
            }
        }.build().also { _blendTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _blendTwo: ImageVector? = null

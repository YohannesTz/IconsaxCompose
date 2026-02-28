package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoreTwo: ImageVector
    get() {
        val current = _moreTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MoreTwo",
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
                moveTo(x = 9.84f, y = 7.16f)
                arcTo(horizontalEllipseRadius = 2.16f, verticalEllipseRadius = 2.16f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 12.0f, y1 = 5.0f)
                moveTo(x = 6.79f, y = 19.0f)
                arcToRelative(a = 2.16f, b = 2.16f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.33f)
                arcToRelative(a = 2.16f, b = 2.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.33f)
                moveToRelative(dx = 10.42f, dy = 0.0f)
                arcToRelative(a = 2.16f, b = 2.16f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.33f)
                arcToRelative(a = 2.16f, b = 2.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.33f)
            }
        }.build().also { _moreTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _moreTwo: ImageVector? = null

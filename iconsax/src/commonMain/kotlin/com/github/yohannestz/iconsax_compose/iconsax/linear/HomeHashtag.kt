package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HomeHashtag: ImageVector
    get() {
        val current = _homeHashtag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HomeHashtag",
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
                moveTo(x = 9.02f, y = 2.84f)
                lineToRelative(dx = -5.39f, dy = 4.2f)
                arcTo(horizontalEllipseRadius = 4.8f, verticalEllipseRadius = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 10.36f)
                verticalLineToRelative(dy = 7.41f)
                arcToRelative(a = 4.23f, b = 4.23f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.21f, dy1 = 4.22f)
                horizontalLineToRelative(dx = 11.58f)
                curveToRelative(dx1 = 2.32f, dy1 = 0.0f, dx2 = 4.21f, dy2 = -1.9f, dx3 = 4.21f, dy3 = -4.21f)
                verticalLineTo(y = 10.5f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.8f, dy1 = -3.45f)
                lineToRelative(dx = -6.18f, dy = -4.33f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = 0.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.5f, y = 18.0f)
                horizontalLineToRelative(dx = 3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.0f)
                verticalLineToRelative(dy = -3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = -3.0f)
                horizontalLineToRelative(dx = -3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = 3.0f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
                moveTo(x = 12.0f, y = 9.0f)
                verticalLineToRelative(dy = 9.0f)
                moveToRelative(dx = -4.5f, dy = -4.5f)
                horizontalLineToRelative(dx = 9.0f)
            }
        }.build().also { _homeHashtag = it }
    }

@Suppress("ObjectPropertyName")
private var _homeHashtag: ImageVector? = null

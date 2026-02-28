package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FtxToken: ImageVector
    get() {
        val current = _ftxToken
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FtxToken",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.0f, y = 2.0f)
                horizontalLineTo(x = 9.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 12.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                verticalLineTo(y = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
                moveToRelative(dx = -9.0f, dy = 15.0f)
                horizontalLineTo(x = 7.0f)
                verticalLineToRelative(dy = 5.0f)
                horizontalLineToRelative(dx = 5.0f)
                close()
                moveTo(x = 7.0f, y = 9.5f)
                horizontalLineTo(x = 2.0f)
                verticalLineToRelative(dy = 5.0f)
                horizontalLineToRelative(dx = 5.0f)
                close()
                moveToRelative(dx = 10.0f, dy = 4.86f)
                horizontalLineToRelative(dx = 1.0f)
                verticalLineTo(y = 9.64f)
                horizontalLineTo(x = 9.5f)
                verticalLineToRelative(dy = 4.72f)
                horizontalLineToRelative(dx = 3.42f)
            }
        }.build().also { _ftxToken = it }
    }

@Suppress("ObjectPropertyName")
private var _ftxToken: ImageVector? = null
